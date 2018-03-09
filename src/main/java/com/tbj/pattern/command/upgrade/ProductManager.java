package com.tbj.pattern.command.upgrade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bjtang
 * @date   2017年7月4日  
 * @desc   产品经理实现类 	
 */
public class ProductManager {

	private static final int TASK_NUMBER_IN_DAY = 4; //一天最多分排掉四个任务，多了推到第二天
	
	private List<Task> taskList;
	
	public ProductManager(){
		taskList = new ArrayList<Task>();
	}
	
	//添加一个任务
	public void receive(Task task){
		taskList.add(task);
	}
	
	//分配给程序员，督促程序员完成
	public void assign(){
		Task[] copy = new Task[taskList.size() > TASK_NUMBER_IN_DAY ? taskList.size() - TASK_NUMBER_IN_DAY : 0];
		for(int i = 0; i < TASK_NUMBER_IN_DAY && i < taskList.size(); i++){
			taskList.get(i).handle();
		}
		System.arraycopy(taskList.toArray(), TASK_NUMBER_IN_DAY > taskList.size() ? taskList.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length);
		taskList = Arrays.asList(copy);
	}
	
	//打印剩下的任务
	public void printTaskList(){
		if(taskList == null || taskList.size() == 0){
			System.out.println("--------当前无任务---------");
			return;
		}
		System.out.println("-------当前剩下的任务列表-----");
		for(Task task : taskList){
			System.out.println(task);
		}
		System.out.println("-----------------------");
	}
	
	/**
	 * 测试
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
		 * System.arraycopy:我们可以使用它来实现数组之间的复制。
		 * public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length);
		 * src:源数组， 
		 * srcPos:源数组要复制的起始位置
		 * dest:目标数组
		 * destPos:目标数组放置的起始位置
		 * length:复制的长度.
		 * 注意：src 和 dest 必须是同类型的数组或者可以进行转换类型的数组.
		 */
		System.arraycopy(list.toArray(), TASK_NUMBER_IN_DAY > list.size() ? list.size() : TASK_NUMBER_IN_DAY, copy, 0, copy.length);
		list = Arrays.asList(copy);
		System.out.println(list);
	}
}
