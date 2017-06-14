/**    
 * �ļ�����BusRegister.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��10��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package DataProcess;

import EventBus.MessageBus;

/**    
 *     
 * ��Ŀ���ƣ�DataStrom    
 * �����ƣ�BusRegister    
 * ��������    ���м���ע��
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��10�� ����3:10:55    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��10�� ����3:10:55    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class BusRegister {
    
    /*
     * ����ע��
     */
public void start()
{
    ReqProcess req=new ReqProcess();
    MessageBus.register("req", req);
    //
    RspProcess rsp=new RspProcess();
    MessageBus.register("rsp", rsp);
    //
    StateProcess state=new StateProcess();
    MessageBus.register("state", state);
    //
    StromCenterProcess center=new StromCenterProcess();
    MessageBus.register("stromState", center);
}
}