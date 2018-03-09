package com.tbj.pattern.mediator.upgrade;

/**
 * @author bjtang
 * @date 2017��7��14��
 * @desc ��½���
 */
public class ContinentalPattern {

	public static void main(String[] args) {

		IPatternAlliance patternAlliance = new PatternAlliance();

		School singletonSchool = new SingletonSchool(patternAlliance);
		School commandSchool = new CommandSchool(patternAlliance);
		School mediatorSchool = new MediatorSchool(patternAlliance);

		School strategySchool = new StrategySchool(patternAlliance);

		// ���Թ�û�б���������
		patternAlliance.add(mediatorSchool);
		patternAlliance.add(commandSchool);
		patternAlliance.add(singletonSchool);

		singletonSchool.attackByPatternAlliance(mediatorSchool);
		commandSchool.attackByPatternAlliance(mediatorSchool);
		System.out.println("------------------------------------------------------");
		mediatorSchool.attackByPatternAlliance(strategySchool);
		System.out.println("------------------------------------------------------");
		strategySchool.attackByPatternAlliance(mediatorSchool);
		mediatorSchool.defenseByPatternAlliance();
		System.out.println("------------------------------------------------------");

	}

}
