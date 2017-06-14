/**    
 * �ļ�����DataCacheBus.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��10��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package CacheDataReset;

import DataBus.CacheData;
import DataBus.CacheTimeListenter;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�DataCacheBus    
 * ��������  �ڴ滺������װ  
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��10�� ����3:32:09    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��10�� ����3:32:09    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class DataCacheBus {
    private static DataCacheBus instance=null;
    public  static   boolean isLoadDB=false;
    public static DataCacheBus getInstance()
    {
        if(instance==null)
        {
            instance=new DataCacheBus();
        }
        return instance;
    }
    CacheData<String,CacheModel> cacheFlage=new CacheData<String,CacheModel>(100000, 120,isLoadDB);
    CacheData<Long,CacheModel> cache=new CacheData<Long,CacheModel>(100000, 120,isLoadDB);
    public  void put(String flage,CacheModel model)
    {
        cacheFlage.put(flage, model);
    }
    public  CacheModel get(String key)
    {
      return   cacheFlage.getByKey(key);
    }
    public  void put(long flage,CacheModel model)
    {
        cache.put(flage, model);
    }
    public  CacheModel get(long key)
    {
      return   cache.getByKey(key);
    }
    public void setStringListenter(CacheTimeListenter<String , CacheModel> listener)
    {
        cacheFlage.setListenter(listener);
    }
    public void setLongListenter(CacheTimeListenter<Long , CacheModel> listener)
    {
        cache.setListenter(listener);
    }
    public void remove(String key)
    {
        cacheFlage.remove(key);
    }
    public void remove(long key)
    {
        cache.remove(key);
    }
}
