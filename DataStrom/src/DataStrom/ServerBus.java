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
	 * 保存服务信息
	 */
public static  HashMultimap<String, ServerModel> map = HashMultimap.create();

/**
 * 保存所有注册中心
 */
public static  HashMultimap<String, ConfigModel> center = HashMultimap.create();
}
