/**
 * 
 */
package DataStrom;

import com.google.common.collect.HashMultimap;

import Config.ConfigModel;

/**
 * @author jinyu
 *
 */
public class ServerBus {
	/*
	 * ���������Ϣ
	 */
public static  HashMultimap<String, ServerModel> map = HashMultimap.create();

/**
 * ��������ע������
 */
public static  HashMultimap<String, ConfigModel> center = HashMultimap.create();
}