package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017��8��8��  
 * @desc   ��֧�ֲ����쳣��
 */
public class UnSupportOperationException extends RuntimeException{

	private static final long serialVersionUID = -5617079006768626170L;
	
	public UnSupportOperationException(){
		super();
	}
	
	public UnSupportOperationException(String message){
		super(message);
	}

}
