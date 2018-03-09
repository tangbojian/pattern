package com.tbj.pattern.mediator;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ��½���
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
