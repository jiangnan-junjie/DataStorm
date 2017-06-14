/**    
 * �ļ�����CurrentServer.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��10��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package ListernerServer;

import java.util.concurrent.ConcurrentHashMap;

import IServer.IProcessServer;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�CurrentServer    
 * ��������  ����ע����Ϣ
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��10�� ����6:10:49    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��10�� ����6:10:49    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class CurrentServer {
    static  ConcurrentHashMap<String,IProcessServer> hash=new ConcurrentHashMap<String,IProcessServer>();
    public  static void addServer(String name,IProcessServer process)
    {
        hash.put(name, process);
    }
    public static void removeServer(String name)
    {
        hash.remove(name);
    }
    public static IProcessServer getProcess(String name)
    {
   return     hash.getOrDefault(name, null);
       
    }
}