package com.tbj.pattern.mediator;

/**
 * @author bjtang
 * @date   2017年7月14日  
 * @desc   大陆格局
 */
public class ContinentalPattern {

	public static void main(String[] args) {
		
		School singletonSchool = new SingletonSchool();
		
		School commandSchool = new CommandSchool();
		
		School mediatorSchool = new MediatorSchool();
		
		singletonSchool.attack(mediatorSchool);
		
		commandSchool.attack(mediatorSchool);
		
		mediatorSchool.defense();
	}
}
