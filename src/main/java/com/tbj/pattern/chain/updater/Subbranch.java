package com.tbj.pattern.chain.updater;

/**
 * @author bjtang
 * @date   2017年8月10日  
 * @desc   分店接口.相当于handler
 */
public interface Subbranch {

	/**设置责任链下一下请求处理者**/
	void setSuccessor(Subbranch subbranch);
	
	/**用于处理请求**/
	boolean handleOrder(Order order);
	
}
