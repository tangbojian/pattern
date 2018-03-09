package com.tbj.pattern.chain.updater;

import java.util.Collections;
import java.util.Map;

import com.tbj.pattern.chain.CommonUtils;

/**
 * @author bjtang
 * @date   2017年8月10日  
 * @desc   具体的麦当劳实现类
 */
public class McSubbranch implements Subbranch {
	
	private final static Integer MIN_DISTANCE = 500;//假设是500米以内送餐
	
	private static int count;
	
	private final int number;
	
	private int x;
	
	private int y;
	
	private Map<String, Integer> menu;
	
	private Subbranch nextSubbranch;
	
	public McSubbranch(int x, int y, Map<String, Integer> menu){
		this.x = x;
		this.y = y;
		this.menu = menu;
		this.number = ++count;
	}
	
	@Override
	public void setSuccessor(Subbranch subbranch) {
		this.nextSubbranch = subbranch;
	}

	@Override
	public boolean handleOrder(Order order) {
		if(CommonUtils.getDistance(order.getX(), order.getY(), this.x, this.y) < MIN_DISTANCE && !CommonUtils.outOfStock(menu, order.getOrder())){
			for (String name : order.getOrder().keySet()) {
                menu.put(name, menu.get(name) - order.getOrder().get(name));
            }
            System.out.println("订餐成功，接受订单的分店是：" + this);
			return true;
		}
		if(nextSubbranch == null){
			System.out.println("对不起,暂时不能为你提供服务");
			return false;
		}
		return nextSubbranch.handleOrder(order);
	}
	
	public Map<String, Integer> getMenu() {
        return Collections.unmodifiableMap(menu);
    }
    
    public Subbranch getNextSubbranch() {
        return nextSubbranch;
    }
    
    public String toString() {
        return "麦当劳分店第" + number + "个";
    }
}
