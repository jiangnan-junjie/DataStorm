/**    
 * �ļ�����CacheBus.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��10��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package CacheDataReset;

import DBTimer.DBClearTimer;
import DBTimer.TimerCount;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�CacheBus    
 * ��������    
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��10�� ����3:51:53    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��10�� ����3:51:53    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class CacheBus {
  private static  DataCacheBus  obj=null;
  public  static   boolean isLoadDB=false;
  static TimerCount timer=null;
  static DBClearTimer dbclear=null;
  public static DataCacheBus getInstance()
  {
      if(obj==null)
      {
          if(isLoadDB)
          {
               timer=new TimerCount();
               timer.startTimer();
               dbclear=new DBClearTimer();
               dbclear.startThread();
          }
          DataCacheBus.isLoadDB=isLoadDB;
          obj=DataCacheBus.getInstance();
          ListenerStringCache listenerStr=new ListenerStringCache();
          ListenerLongCache  listenerLong=new ListenerLongCache();
          obj.setStringListenter(listenerStr);
          obj.setLongListenter(listenerLong);
      }
      return obj;
  }
}
