/**    
 * �ļ�����IProcessServer.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��10��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package IServer;

import Util.IDataPackaget;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�IProcessServer    
 * ��������  ҵ������  
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��10�� ����5:13:53    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��10�� ����5:13:53    
 * �޸ı�ע��    
 * @version     
 *     
 */
public interface IProcessServer {
public void  recRequest(IDataPackaget packaget);
public IDataPackaget  take();

}