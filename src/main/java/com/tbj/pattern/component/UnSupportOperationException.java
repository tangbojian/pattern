package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017年8月8日  
 * @desc   不支持操作异常类
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
