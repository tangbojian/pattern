package com.tbj.pattern.strategy.actualCombat.upgrade2;

import java.io.File;
import java.io.FileFilter;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

public class CalPriceFactory {

	private static final String CAL_PRICE_PACKAGE = "com.tbj.pattern.strategy.actualCombat.upgrade2";

	private ClassLoader classLoader = getClass().getClassLoader();

	private List<Class<? extends CalPrice>> calPriceList; // 策略列表

	public CalPrice createCalPrice(Customer customer) {
		// 变化点：为了支持优先排序，我们采用可排序的Map支持，这个Map是为了存储我们当前策略的运行时类信息
		SortedMap<Integer, Class<? extends CalPrice>> clazzMap = new TreeMap<Integer, Class<? extends CalPrice>>();
		// 在策略列表查找策略
		for (Class<? extends CalPrice> clazz : calPriceList) {
			Annotation validRegion = handleAnnotation(clazz);
			// 变化点：根据注解类型进行不同的判断
			if (validRegion instanceof TotalValidRegion) {
				TotalValidRegion totalValidRegion = (TotalValidRegion) validRegion;
				// 判断总金额是否在注解的区间
				if (customer.getTotalAmount() > totalValidRegion.value().min()
						&& customer.getTotalAmount() < totalValidRegion.value()
								.max()) {
					clazzMap.put(totalValidRegion.value().order(), clazz);
				}
			} else if (validRegion instanceof OnceValidRegion) {
				OnceValidRegion onceValidRegion = (OnceValidRegion) validRegion;
				// 判断单次的金额是否在注解区间, 注意这次判断是客户当次消费的金额
				if (customer.getAmount() > onceValidRegion.value().min()
						&& customer.getAmount() < onceValidRegion.value().max()) {
					clazzMap.put(onceValidRegion.value().order(), clazz);
				}
			}
		}

		System.out.println(CalPriceProxy.getProxy(clazzMap));
		return CalPriceProxy.getProxy(clazzMap);

	}

	private Annotation handleAnnotation(Class<? extends CalPrice> clazz) {
		Annotation[] annotations = clazz.getDeclaredAnnotations();
		if (annotations == null || annotations.length == 0) {
			return null;
		}
		for (int i = 0; i < annotations.length; i++) {
			// 变化点：这里稍微改动了下,如果是TotalValidRegion，OnceValidRegion 这两种注解 则返回
			if (annotations[i] instanceof TotalValidRegion
					|| annotations[i] instanceof OnceValidRegion) {
				return annotations[i];
			}
		}
		return null;
	}

	/* 以下不需要改变 */

	// 单例，并且我们需要在工厂初始化的时候
	private CalPriceFactory() {
		init();
	}

	// 在工厂初始化时要初始化策略列表
	private void init() {
		calPriceList = new ArrayList<Class<? extends CalPrice>>();
		File[] resources = getResources();// 获取到包下所有的class文件
		Class<CalPrice> calPriceClazz = null;
		try {
			calPriceClazz = (Class<CalPrice>) classLoader
					.loadClass(CalPrice.class.getName());// 使用相同的加载器加载策略接口
		} catch (ClassNotFoundException e1) {
			throw new RuntimeException("未找到策略接口");
		}
		for (int i = 0; i < resources.length; i++) {
			try {
				// 载入包下的类
				Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "."
						+ resources[i].getName().replace(".class", ""));
				// 判断是否是CalPrice的实现类并且不是CalPrice它本身，满足的话加入到策略列表
				if (CalPrice.class.isAssignableFrom(clazz)
						&& clazz != calPriceClazz) {
					calPriceList.add((Class<? extends CalPrice>) clazz);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	// 获取扫描的包下面所有的class文件
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(
					CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
			return file.listFiles(new FileFilter() {
				public boolean accept(File pathname) {
					if (pathname.getName().endsWith(".class")) {// 我们只扫描class文件
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("未找到策略资源");
		}
	}

	public static CalPriceFactory getInstance() {
		return CalPriceFactoryInstance.instance;
	}

	private static class CalPriceFactoryInstance {

		private static CalPriceFactory instance = new CalPriceFactory();
	}

}
