/**    
 * �ļ�����ServerTimer.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��14��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package ListernerServer;

import java.util.Map;

import java.util.concurrent.locks.ReentrantLock;

import Config.CenterConfig;

import JNetSocket.MulticastClient;

import Util.FactoryPackaget;
import Util.ServerInfo;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�ServerTimer    
 * ��������  ��ʱ�ϱ�����״̬����������
 * ��ǰͨ���鲥���ͣ���ַ�Ѿ��̻�ConfigModel��  
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��14�� ����11:45:52    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��14�� ����11:45:52    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class ServerTimer {
    private static Thread  stateReset=null;//����߳�
    private static ReentrantLock lock=new ReentrantLock();
    protected static boolean isRuning;//�����߳�����
    /*
     * �����̷߳���state
     */
    public static void startThread()
    {
            try
            {
            if(stateReset==null)
            {
                stateReset=new   Thread(new Runnable()
                        {
                           @Override
                           public void run() {
                               FactoryPackaget f=new FactoryPackaget();
                               MulticastClient client=new MulticastClient();//�鲥ͨѶ
                              while(isRuning)
                              {
                               try {
                                     for(Map.Entry<String,ServerInfo> entry:CenterConfig.localServer.entrySet())
                                     {
                                        byte[]data= f.unDataModel(entry.getValue());
                                        client.sendData(CenterConfig.masterCenter.multIP, CenterConfig.masterCenter.port, data);
                                     }
                                       Thread.sleep(100);
                          
                    
                               } catch (InterruptedException e) {
                                   e.printStackTrace();
                               }
                               
                              }
                           }
                    
                        });
                stateReset.setDaemon(true);
                stateReset.setName("sendServerState");
                stateReset.start();
                    
                }
            }
            finally
            {
                lock.unlock();
            }
        }
   
    }
