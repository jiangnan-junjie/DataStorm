package Client;
import EventBus.MessageBus;
import Util.ReqPackaget;

/**    
 * �ļ�����StromClient.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��11��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */

/**    
 *     
 * ��Ŀ���ƣ�DataStromClient    
 * �����ƣ�StromClient    
 * ��������    ���͸����ĵ�����
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��11�� ����2:15:20    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��11�� ����2:15:20    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class StromClient {
    ListenerReq listener=null;
    public StromClient()
    {
        listener=new ListenerReq();
        MessageBus.getBus("clientReq").register(listener);
    }
public void  sendRequest(ReqPackaget req)
{
    MessageBus.getBus("clientReq").post(req);
}
}