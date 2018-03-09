package com.tbj.pattern.chain;

import java.util.Collections;
import java.util.Map;

/**
 * @author bjtang
 * @date   2017��8��9��  
 * @desc   ���ͷֵ���
 */
public class McSubbranch {

	/**���ͷ�Χ**/
	private final static int MIN_DISTANCE = 500;
	
	/**һ����¼�м��ҷֵ���**/
	private static int count;
	
	/**��ǰ��ĵ��̺�**/
	private final int number;
	
	/**��ǰ��ĺ�����**/
	private int x;
	
	/**��ǰ���������**/
	private int y;
	
	/**��ǰ�Ĳ˵�**/
	private Map<String, Integer> menu;
	
	public McSubbranch(int x, int y, Map<String, Integer> menu){
		super();
		this.x = x;
		this.y = y;
		this.menu = menu;
		number = ++count;
	}
	
	/**
	 * �����ж��Ƿ������Ͳ�Ҫ��: 1:���������ͷ�Χ�� 2�����㶫�������� С�ڻ���ڵ�ǰ���ﶫ��������
	 * @param x
	 * @param y
	 * @param order
	 * @return
	 */
	public boolean order(int x, int y, Map<String, Integer> order){
		//�������С��500�ײ��Ҷ����е�ʳ�ﲻȱ��,�򶩵��ɹ�,����ʧ��.
		if(CommonUtils.getDistance(x, y, this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order)){
			for(String name : order.keySet()){
				menu.put(name, menu.get(name) - order.get(name));
			}
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * ���ز����޸ĵĲ˵�����
	 * @return
	 */
	public Map<String, Integer> getMenu(){
		return Collections.unmodifiableMap(menu);
	}

	@Override
	public String toString() {
		return "���ͷֵ���" + number + "��";
	}
	
}
