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
 * @date   2017年11月10日  
 * @desc   首先工厂应该是一个单例的.我们使用静态内部类来实现.
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
	 * 因为这几个类都属于没有状态的类，估不会存在线程安全的问题，估可以返回相同的引用.
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
	 *初始化,得到所有class文件
	 */
	@SuppressWarnings("unchecked")
	private void init() {
		clazzList = new ArrayList<Class<? extends InterestInterface>>();
		File[] files = getResources();
		//我们现在得到了所有的.class文件,但是我们只需要 实现了 InterestInterface 的class文件.
		
		Class<? extends InterestInterface> InterestInterfaceClazz = null;
		try{
			InterestInterfaceClazz = (Class<? extends InterestInterface>) classLoader.loadClass(InterestInterface.class.getName());
		} catch (Exception e){
			throw new RuntimeException("未找到 " +InterestInterface.class.getName() + "此类");
		}
		
		for(File file : files){
			try {
				Class<? extends InterestInterface> clazz = (Class<? extends InterestInterface>) classLoader.loadClass(CLASS_PATH + "." + file.getName().replace(".class", ""));
				//当前的class对象必须是 此 接口InterestInterface的实现类，并且不能是其本身
				if(InterestInterface.class.isAssignableFrom(clazz) && clazz != InterestInterfaceClazz){
					clazzList.add(clazz);
				}
			} catch (ClassNotFoundException e) {
				throw new RuntimeException("未找到 " +CLASS_PATH + "." + file.getName().replace(".class", "") + "此类");
			}
		}
	}


	/***
	 * 得到指定路径下所有的class文件
	 * @throws  
	 */
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(CLASS_PATH.replace(".", "/")).toURI());
			//返回此路径下所有的文件资源,但是我们只需要以 .class 结尾的文件
			//估我们用过滤器来过滤符合条件的文件资源
			return file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					/**
					 * 如果文件是以.class 结尾的话,那么返回 true,接收, 负责, 过滤掉
					 */
					if(pathname.getName().endsWith(".class")){
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("未找到资源文件");
		}
	}


	/**
	 * 这种方式实现的单例模式应该属于最线程安全的类,在高并发下也能保证只实例化一个对象
	 * @author bjtang
	 * @date   2017年11月10日  
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
	 * 将这一快优化为注解
	 * @param level
	 * @return
	 */
	public static InterestInterface get(String level){
		if(StringUtils.isBlank(level)){
			System.out.println("参数错误");
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
			throw new RuntimeException("请实现  InterestInterface 接口");
		}
		
		for(Class<? extends InterestInterface> clazz : clazzList){
			//验证此clazz 是否有我们需要的注解
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
