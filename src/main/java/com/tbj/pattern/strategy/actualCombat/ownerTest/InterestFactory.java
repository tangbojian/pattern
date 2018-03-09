package com.tbj.pattern.strategy.actualCombat.ownerTest;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;



/***
 * @author bjtang
 * @date   2017��11��10��  
 * @desc   ���ȹ���Ӧ����һ��������.����ʹ�þ�̬�ڲ�����ʵ��.
 */
public class InterestFactory {
	
	private List<Class<? extends InterestInterface>> clazzList = null; 
	
	private static final String CLASS_PATH = "com.tbj.pattern.strategy.actualCombat.ownerTest";
	
	private ClassLoader classLoader = this.getClass().getClassLoader();
	
	private static InterestInterface common;
	private static InterestInterface vip1;
	private static InterestInterface vip2;
	private static InterestInterface vip3;
	
	
	/**
	 * ��Ϊ�⼸���඼����û��״̬���࣬����������̰߳�ȫ�����⣬�����Է�����ͬ������.
	 */
	static {
		 common = new CommonCompanyInterestInterface();
		 vip1 = new Vip1CompanyInterestInterface();
		 vip2 = new Vip2CompanyInterestInterface();
		 vip3 = new Vip3CompanyInterestInterface();
	}

	private InterestFactory(){
		init();
	}
	
	
	/**
	 *��ʼ��,�õ�����class�ļ�
	 */
	@SuppressWarnings("unchecked")
	private void init() {
		clazzList = new ArrayList<Class<? extends InterestInterface>>();
		File[] files = getResources();
		//�������ڵõ������е�.class�ļ�,��������ֻ��Ҫ ʵ���� InterestInterface ��class�ļ�.
		
		Class<? extends InterestInterface> InterestInterfaceClazz = null;
		try{
			InterestInterfaceClazz = (Class<? extends InterestInterface>) classLoader.loadClass(InterestInterface.class.getName());
		} catch (Exception e){
			throw new RuntimeException("δ�ҵ� " +InterestInterface.class.getName() + "����");
		}
		
		for(File file : files){
			try {
				Class<? extends InterestInterface> clazz = (Class<? extends InterestInterface>) classLoader.loadClass(CLASS_PATH + "." + file.getName().replace(".class", ""));
				//��ǰ��class��������� �� �ӿ�InterestInterface��ʵ���࣬���Ҳ������䱾��
				if(InterestInterface.class.isAssignableFrom(clazz) && clazz != InterestInterfaceClazz){
					clazzList.add(clazz);
				}
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("δ�ҵ� " +CLASS_PATH + "." + file.getName().replace(".class", "") + "����");
			}
		}
	}


	/***
	 * �õ�ָ��·�������е�class�ļ�
	 * @throws  
	 */
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(CLASS_PATH.replace(".", "/")).toURI());
			//���ش�·�������е��ļ���Դ,��������ֻ��Ҫ�� .class ��β���ļ�
			//�������ù����������˷����������ļ���Դ
			return file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					/**
					 * ����ļ�����.class ��β�Ļ�,��ô���� true,����, ����, ���˵�
					 */
					if(pathname.getName().endsWith(".class")){
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("δ�ҵ���Դ�ļ�");
		}
	}


	/**
	 * ���ַ�ʽʵ�ֵĵ���ģʽӦ���������̰߳�ȫ����,�ڸ߲�����Ҳ�ܱ�ֻ֤ʵ����һ������
	 * @author bjtang
	 * @date   2017��11��10��  
	 * @desc
	 */
	private static class Singleton{
		
		private static InterestFactory instance;
		
		static {
			instance = new InterestFactory();
		}
	}
	
	public static InterestFactory getInstance(){
		return Singleton.instance;
	}
	
	
	/**
	 * ����һ���Ż�Ϊע��
	 * @param level
	 * @return
	 */
	public static InterestInterface get(String level){
		if(StringUtils.isBlank(level)){
			System.out.println("��������");
			return null;
		}
		if(level == "common"){
			return common;
		} else if(level == "vip1"){
			return vip1;
		} else if(level == "vip2"){
			return vip2;
		} else if(level == "vip3"){
			return vip3;
		} else {
			return null;
		}
	}
	
	public InterestInterface getModel(String level) throws InstantiationException, IllegalAccessException{
		if(clazzList == null || clazzList.size() == 0){
			throw new RuntimeException("��ʵ��  InterestInterface �ӿ�");
		}
		
		for(Class<? extends InterestInterface> clazz : clazzList){
			//��֤��clazz �Ƿ���������Ҫ��ע��
			InterestAnnotation annotation = validateClazz(clazz);
			if(annotation == null || !annotation.level().equals(level)){
				continue;
			}
			return clazz.newInstance();
		}
		
		return null;
	}
	
	
	
	private InterestAnnotation validateClazz(Class<? extends InterestInterface> clazz) {
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if(annotations != null && annotations.length > 0){
			for(Annotation annotation : annotations){
				if(annotation instanceof InterestAnnotation){
					return (InterestAnnotation) annotation;
				}
			}
		}
		return null;
	}


	public static void main(String[] args) {
		
		String name = InterestInterface.class.getName();
		System.out.println(name);
	}
	
}
