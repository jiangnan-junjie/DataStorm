/**    
 * �ļ�����CenterConfig.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��14��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package Config;

import java.util.concurrent.ConcurrentHashMap;

import Util.ServerInfo;

/**    
 *     
 * ��Ŀ���ƣ�DataStromServer    
 * �����ƣ�CenterConfig    
 * ��������    
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��14�� ����10:46:16    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��14�� ����10:46:16    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class CenterConfig {
    /**
     * ��ע������
     */
 public  static  ConfigModel   masterCenter=new ConfigModel();
 
 /**
  * ���з�������
  */
 public static  ConcurrentHashMap<String,ConfigModel> allCenter=new  ConcurrentHashMap<String,ConfigModel>();
 
 /*
  * ���ڵ������Ϣ
  */
 public  static  ConcurrentHashMap<String,ServerInfo> localServer=new ConcurrentHashMap<String,ServerInfo>();
}