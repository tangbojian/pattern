package com.tbj.pattern.chain;

import java.util.Collections;
import java.util.Map;

/**
 * @author bjtang
 * @date   2017年8月9日  
 * @desc   麦当劳分店类
 */
public class McSubbranch {

	/**配送范围**/
	private final static int MIN_DISTANCE = 500;
	
	/**一共记录有几家分店铺**/
	private static int count;
	
	/**当前店的店铺号**/
	private final int number;
	
	/**当前店的横坐标**/
	private int x;
	
	/**当前店的纵坐标**/
	private int y;
	
	/**当前的菜单**/
	private Map<String, Integer> menu;
	
	public McSubbranch(int x, int y, Map<String, Integer> menu){
		super();
		this.x = x;
		this.y = y;
		this.menu = menu;
		number = ++count;
	}
	
	/**
	 * 用于判断是否满足送餐要求: 1:距离在配送范围内 2：所点东西的数量 小于或等于当前店里东西的数量
	 * @param x
	 * @param y
	 * @param order
	 * @return
	 */
	public boolean order(int x, int y, Map<String, Integer> order){
		//如果距离小于500米并且订单中的食物不缺货,则订单成功,否则失败.
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
	 * 返回不可修改的菜单集合
	 * @return
	 */
	public Map<String, Integer> getMenu(){
		return Collections.unmodifiableMap(menu);
	}

	@Override
	public String toString() {
		return "麦当劳分店铺" + number + "个";
	}
	
}
