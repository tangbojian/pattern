package com.tbj.pattern.chain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bjtang
 * @date   2017年8月10日  
 * @desc   模拟订餐过程
 */
public class Client {
	
	public static void main(String[] args) {
		//假设初始化菜单都是以下这些东西
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("汉堡", 5);
		menu.put("薯条", 5);
		menu.put("可乐", 5);
		menu.put("雪碧", 5);
		//假设有5个分店
		McSubbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));
		
		List<McSubbranch> mcSubbranchs = Arrays.asList(mcSubbranch1, mcSubbranch2, mcSubbranch3, mcSubbranch4, mcSubbranch5);
		
		//小左开始订餐,假设小左的坐标是900,0
		Map<String, Integer> order = new HashMap<String, Integer>();
		order.put("汉堡", 2);
		order.put("可乐", 1);
		order.put("薯条", 1);
		
		print(mcSubbranchs);
		
		System.out.println("---------------------");
		//小左开始一家一家挨着尝试订餐.知道成功
		for(McSubbranch mcSubbranch : mcSubbranchs){
			if(mcSubbranch.order(900, 20, order)){
				System.out.println("订餐成功,接受订单的分店是：" + mcSubbranch);
				break;
			}
		}
		
		System.out.println("----------------------");
		print(mcSubbranchs);
		
	}
	
	public static void print(List<McSubbranch> mcSubbranchs){
		for(McSubbranch mcSubbranch : mcSubbranchs){
			System.out.println("[" + mcSubbranch + "]的菜单:" + mcSubbranch.getMenu());
			
		}
	}
	
}
