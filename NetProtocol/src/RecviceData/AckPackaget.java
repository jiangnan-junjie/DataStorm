/**    
 * �ļ�����AckPackaget.java    
 *    
 * �汾��Ϣ��    
 * ���ڣ�2017��6��12��    
 * Copyright ���� Corporation 2017     
 * ��Ȩ����    
 *    
 */
package RecviceData;

/**    
 *     
 * ��Ŀ���ƣ�NetProtocol    
 * �����ƣ�AckPackaget    
 * ��������    
 * �����ˣ�jinyu    
 * ����ʱ�䣺2017��6��12�� ����8:39:19    
 * �޸��ˣ�jinyu    
 * �޸�ʱ�䣺2017��6��12�� ����8:39:19    
 * �޸ı�ע��    
 * @version     
 *     
 */
public class AckPackaget {
    
    /**
     * 0���ͷ�ȷ��ack
     * 1���շ�����ack
     * 2��������ack
     */
    public byte  ackType=0;
    /**
     * session id
     */
public long sessionid=0;

/*
 * ��ǰsession���������
 */
public int  packagetNum=0;

/**
 * ackType=2ʱʹ��
 */
public long packagetID=-1;
}