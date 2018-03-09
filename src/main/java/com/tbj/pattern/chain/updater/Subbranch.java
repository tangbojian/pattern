package com.tbj.pattern.chain.updater;

/**
 * @author bjtang
 * @date   2017��8��10��  
 * @desc   �ֵ�ӿ�.�൱��handler
 */
public interface Subbranch {

	/**������������һ����������**/
	void setSuccessor(Subbranch subbranch);
	
	/**���ڴ�������**/
	boolean handleOrder(Order order);
	
}
