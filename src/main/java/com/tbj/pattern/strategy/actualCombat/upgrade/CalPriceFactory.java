package com.tbj.pattern.strategy.actualCombat.upgrade;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author bjtang
 * @date 2017年6月9日
 * @desc 基于注解的简单工厂:在这里在特别说明一点，我们的策略实现类最好放在一个包中，这样我们可以扫描特定的包，可以加快初始化速度.
 */
@SuppressWarnings("unchecked")
public class CalPriceFactory {

	private static final String CAL_PRICE_PACKAGE = "com.tbj.pattern.strategy.actualCombat.upgrade"; //这里是一个常量,表示我们扫描策略的包.这是我的包名
	
	private ClassLoader classLoader = this.getClass().getClassLoader(); //类加载器(系统类加载器)
	
	private List<Class<? extends CalPrice>> calPriceList;  //策略列表
	
	
	public CalPrice createCalPrice(Customer customer){
		//在策略列表查找策略
		for(Class<? extends CalPrice> clazz : calPriceList){
			//获取注解区间
			TotalValidRegion validRegion = handleAnnotation(clazz); 
			//判断金额是否在注解区间
			if(customer.getTotalAmount() > validRegion.min() && customer.getTotalAmount() < validRegion.max()){
				try {
					return clazz.newInstance();
				}  catch (Exception e) {
					throw new RuntimeException("策略获得失败");
				}
			}
		}
		throw new RuntimeException("策略获得失败");
	}

	
	//处理注解,我们传入一个策略类,返回它的注解
	private TotalValidRegion handleAnnotation(Class<? extends CalPrice> clazz) {
		// TODO Auto-generated method stub
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if(annotations == null || annotations.length == 0){
			return null;
		}
		for(int i = 0; i < annotations.length; i++){
			if(annotations[i] instanceof TotalValidRegion){
				return (TotalValidRegion) annotations[i];
			}
		}
		return null;
	}
	
	//在工厂初始化时要初始化策略列表
	private void init(){
		calPriceList = new ArrayList<Class<? extends CalPrice>>();
		File[] resource = getResource(); //获取包下所有的class文件
		Class<CalPrice> calPriceClazz = null;
		try {
			//获取策略接口的Class
			calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("未找到策略接口");
		}
		for(int i = 0; i < resource.length; i++){
			try {
				Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resource[i].getName().replace(".class", ""));
				//isAssignableFrom:用来判断 类A 和 类B 是否相同,或者 是另一个类的超类或者接口
				if(CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz){
					calPriceList.add((Class<? extends CalPrice>) clazz);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	//获取符合条件的资源文件
	private File[] getResource() {
		// TODO Auto-generated method stub
		try {
			//得到一个文件夹
			File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
			//获取此文件夹下所有的.class文件
			return file.listFiles(new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					// TODO Auto-generated method stub
					if(pathname.getName().endsWith(".class")){
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("未找到策略资源");
		}
	}
	
	//单例
    private CalPriceFactory(){
        init();
    }
    
    //使用静态内部类的方式实现单利
    public static CalPriceFactory getInstance(){
    	return CalPriceFactoryInstance.instance;
    }
    
    private static class CalPriceFactoryInstance{
    	private static CalPriceFactory instance = new CalPriceFactory();
    } 
	

}
