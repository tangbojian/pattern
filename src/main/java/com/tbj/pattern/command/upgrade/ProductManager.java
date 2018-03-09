package com.tbj.pattern.command.upgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bjtang
 * @date   2017��7��4��  
 * @desc   ��Ʒ����ʵ���� 	
 */
public class ProductManager {

	private static final int TASK_NUMBER_IN_DAY = 4; //һ�������ŵ��ĸ����񣬶����Ƶ��ڶ���
	
	private List<Task> taskList;
	
	public ProductManager(){
		taskList = new ArrayList<Task>();
	}
	
	//���һ������
	public void receive(Task task){
		taskList.add(task);
	}
	
	//���������Ա�����ٳ���Ա���
	public void assign(){
		Task[] copy = new Task[taskList.size() > TASK_NUMBER_IN_DAY ? taskList.size() - TASK_NUMBER_IN_DAY : 0];
		for(int i = 0; i < TASK_NUMBER_IN_DAY && i < taskList.size(); i++){
			taskList.get(i).handle();
		}
		System.arraycopy(taskList.toArray(), TASK_NUMBER_IN_DAY > taskList.size() ? taskList.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length);
		taskList = Arrays.asList(copy);
	}
	
	//��ӡʣ�µ�����
	public void printTaskList(){
		if(taskList == null || taskList.size() == 0){
			System.out.println("--------��ǰ������---------");
			return;
		}
		System.out.println("-------��ǰʣ�µ������б�-----");
		for(Task task : taskList){
			System.out.println(task);
		}
		System.out.println("-----------------------");
	}
	
	/**
	 * ����
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		String[] copy = new String[list.size() > TASK_NUMBER_IN_DAY ? list.size() - TASK_NUMBER_IN_DAY : 0];
		for(int i = 0; i < TASK_NUMBER_IN_DAY && i < list.size(); i++){
			System.out.println(list.get(i));
		}
		/**
		 * System.arraycopy:���ǿ���ʹ������ʵ������֮��ĸ��ơ�
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		 * src:Դ���飬 
		 * srcPos:Դ����Ҫ���Ƶ���ʼλ��
		 * dest:Ŀ������
		 * destPos:Ŀ��������õ���ʼλ��
		 * length:���Ƶĳ���.
		 * ע�⣺src �� dest ������ͬ���͵�������߿��Խ���ת�����͵�����.
		 */
		System.arraycopy(list.toArray(), TASK_NUMBER_IN_DAY > list.size() ? list.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length);
		list = Arrays.asList(copy);
		System.out.println(list);
	}
}
