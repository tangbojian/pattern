package com.tbj.pattern.command.init;

public class Work {

	public static void main(String[] args) {
		
		Programmer programmer = new Programmer("Ð¡×ó");
		
		Salesman salesmanA = new Salesman("A");
		salesmanA.putDemand(programmer);
		
		Salesman salesmanB = new Salesman("B");
		salesmanB.putBug(programmer);
		
		Salesman salesmanC = new Salesman("C");
		salesmanC.putProblem(programmer);
		
	}
	
}
