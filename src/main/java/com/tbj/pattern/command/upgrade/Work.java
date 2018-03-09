package com.tbj.pattern.command.upgrade;

import com.tbj.pattern.command.init.Programmer;

/**
 * @author bjtang
 * @date   2017��7��7��  
 * @desc   ������
 */
public class Work {

	public static void main(String[] args) {
        Programmer xiaozuo = new Programmer("С��");
        ProductManager productManager = new ProductManager();
        
        Salesman salesmanA = new Salesman("A");
        Salesman salesmanB = new Salesman("B");
        Salesman salesmanC = new Salesman("C");
        Salesman salesmanD = new Salesman("D");
        
        salesmanA.putDemand(productManager, xiaozuo);
        salesmanB.putDemand(productManager, xiaozuo);
        salesmanB.putBug(productManager, xiaozuo);
        salesmanC.putDemand(productManager, xiaozuo);
        salesmanC.putProblem(productManager, xiaozuo);
        salesmanD.putDemand(productManager, xiaozuo);
        
        System.out.println("��һ���Ʒ�����������");
        productManager.assign();
        productManager.printTaskList();
        System.out.println("�ڶ����Ʒ�����������");
        productManager.assign();
        productManager.printTaskList();
    }
	
}
