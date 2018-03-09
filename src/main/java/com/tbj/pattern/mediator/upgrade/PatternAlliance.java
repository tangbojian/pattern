package com.tbj.pattern.mediator.upgrade;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjtang
 * @date   2017��7��14��  
 * @desc   ģʽ���T���н��� 	
 */
public class PatternAlliance implements IPatternAlliance {
	
	private List<School> schoolList;
	
	public PatternAlliance(){
		schoolList = new ArrayList<School>();
	}

	@Override
	public void add(School school) {
		schoolList.add(school);
	}

	@Override
	public void remove(School school) {
		schoolList.remove(school);
	}

	@Override
	public void resolveAttack(School activeSide, School passiveSide) {
		if(schoolList.contains(activeSide) && schoolList.contains(passiveSide)){
			System.out.println("������" + activeSide.getName() + "�Լ�������" + passiveSide.getName() + "���Ѽ������ˣ���������ڧ��");
		}else if(schoolList.contains(activeSide) && !schoolList.contains(passiveSide)){
			 System.out.println("������" + activeSide.getName() + "�Ѽ������ˣ�������" + passiveSide.getName() + "��������֮�У������幥������ɣ�");
			 for(School school : schoolList){
				 school.attack(passiveSide);
			 }
		}else if(!schoolList.contains(activeSide) && schoolList.contains(passiveSide)){
			System.out.println("������" + activeSide.getName() + "δ�������ˣ�������" + passiveSide.getName() + "������֮�У������������");
		    for(School school : schoolList){
			     school.defense();
		    }
		}else{
			System.out.println("������" + activeSide.getName() + "δ�������ˣ�������" + passiveSide.getName() + "δ�������T,������Ȩ��Ԥ���£�");
			activeSide.attack(passiveSide);
		}
	}

	@Override
	public void resolveDefense(School passiveSide) {
		if(schoolList.contains(passiveSide)){
			System.out.println("������" + passiveSide.getName() + "������֮�У������������");
		    for(School school : schoolList){
			     school.defense();
		    }
		}else{
			 System.out.println("������" + passiveSide.getName() + "δ�������ˣ����˲��������������");
	         passiveSide.defense();
		}
	}

}
