package com.tbj.pattern.chain;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bjtang
 * @date   2017��8��10��  
 * @desc   ģ�ⶩ�͹���
 */
public class Client {
	
	public static void main(String[] args) {
		//�����ʼ���˵�����������Щ����
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("����", 5);
		menu.put("����", 5);
		menu.put("����", 5);
		menu.put("ѩ��", 5);
		//������5���ֵ�
		McSubbranch mcSubbranch1 = new McSubbranch(0, 0, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch2 = new McSubbranch(100, 120, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch3 = new McSubbranch(-100, -120, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch4 = new McSubbranch(1000, 20, new HashMap<String, Integer>(menu));
		McSubbranch mcSubbranch5 = new McSubbranch(-500, 0, new HashMap<String, Integer>(menu));
		
		List<McSubbranch> mcSubbranchs = Arrays.asList(mcSubbranch1, mcSubbranch2, mcSubbranch3, mcSubbranch4, mcSubbranch5);
		
		//С��ʼ����,����С���������900,0
		Map<String, Integer> order = new HashMap<String, Integer>();
		order.put("����", 2);
		order.put("����", 1);
		order.put("����", 1);
		
		print(mcSubbranchs);
		
		System.out.println("---------------------");
		//С��ʼһ��һ�Ұ��ų��Զ���.֪���ɹ�
		for(McSubbranch mcSubbranch : mcSubbranchs){
			if(mcSubbranch.order(900, 20, order)){
				System.out.println("���ͳɹ�,���ܶ����ķֵ��ǣ�" + mcSubbranch);
				break;
			}
		}
		
		System.out.println("----------------------");
		print(mcSubbranchs);
		
	}
	
	public static void print(List<McSubbranch> mcSubbranchs){
		for(McSubbranch mcSubbranch : mcSubbranchs){
			System.out.println("[" + mcSubbranch + "]�Ĳ˵�:" + mcSubbranch.getMenu());
			
		}
	}
	
}
