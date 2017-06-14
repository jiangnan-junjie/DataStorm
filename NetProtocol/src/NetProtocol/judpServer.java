/**    
 * �ļ�����judpServer.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��11��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package NetProtocol;

import EventBus.MessageBus;
import JNetSocket.UDPServerSocket;

/**    
 *     
 * ��Ŀ���ƣ�NetProtocol    
 * �����ƣ�judpServer    
 * ��������    
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��11�� ����7:23:58    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��11�� ����7:23:58    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class judpServer {
    UDPServerSocket  server=null;
    ListenerServer listener=null;
    /*
     * ��ʼ������
     */
    public boolean InitServer(String host,int port)
    {
        if(server==null)
        {
            server=new UDPServerSocket();
            boolean    r= server.InitServer(host, port);
            if(r)
            {
                //��ʼ���ɹ�
                listener=new ListenerServer();
                MessageBus.register("udp", listener);
            }
        }
        return true;
    }
    public void close()
    {
        if(server!=null)
        {
            server.close();
        }
    }
}