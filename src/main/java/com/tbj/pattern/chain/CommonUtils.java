package com.tbj.pattern.chain;

import java.util.Map;

/**
 * @author bjtang
 * @date   2017��8��10��  
 * @desc   �򵥵Ĺ����� 
 */
public class CommonUtils {

	private CommonUtils(){};
	
	/***
	 * ��������֮��ľ���
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
	 * �Ƿ�ȱ��: true ȱ���� false ��ȱ��
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
