package com.tbj.pattern.chain;

import java.util.Map;

/**
 * @author bjtang
 * @date   2017年8月10日  
 * @desc   简单的工具类 
 */
public class CommonUtils {

	private CommonUtils(){};
	
	/***
	 * 计算两点之间的距离
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @return
	 */
	public static double getDistance(int x1, int y1, int x2, int y2){
		return Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}
	
	/**
	 * 是否缺货: true 缺货， false 不缺货
	 * @param menu
	 * @param order
	 * @return
	 */
	public static boolean outOfStock(Map<String, Integer> menu, Map<String, Integer> order){
		if(order == null || order.size() == 0){
			return false;
		}
		if(menu == null || menu.size() == 0){
			return true;
		}
		for(String name : order.keySet()){
			if(menu.get(name) - order.get(name) < 0){
				return true;
			}
		}
		return false;
	}
	
}
