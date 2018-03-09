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

	private List<Class<? extends CalPrice>> calPriceList; // �����б�

	public CalPrice createCalPrice(Customer customer) {
		// �仯�㣺Ϊ��֧�������������ǲ��ÿ������Map֧�֣����Map��Ϊ�˴洢���ǵ�ǰ���Ե�����ʱ����Ϣ
		SortedMap<Integer, Class<? extends CalPrice>> clazzMap = new TreeMap<Integer, Class<? extends CalPrice>>();
		// �ڲ����б���Ҳ���
		for (Class<? extends CalPrice> clazz : calPriceList) {
			Annotation validRegion = handleAnnotation(clazz);
			// �仯�㣺����ע�����ͽ��в�ͬ���ж�
			if (validRegion instanceof TotalValidRegion) {
				TotalValidRegion totalValidRegion = (TotalValidRegion) validRegion;
				// �ж��ܽ���Ƿ���ע�������
				if (customer.getTotalAmount() > totalValidRegion.value().min()
						&& customer.getTotalAmount() < totalValidRegion.value()
								.max()) {
					clazzMap.put(totalValidRegion.value().order(), clazz);
				}
			} else if (validRegion instanceof OnceValidRegion) {
				OnceValidRegion onceValidRegion = (OnceValidRegion) validRegion;
				// �жϵ��εĽ���Ƿ���ע������, ע������ж��ǿͻ��������ѵĽ��
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
			// �仯�㣺������΢�Ķ�����,�����TotalValidRegion��OnceValidRegion ������ע�� �򷵻�
			if (annotations[i] instanceof TotalValidRegion
					|| annotations[i] instanceof OnceValidRegion) {
				return annotations[i];
			}
		}
		return null;
	}

	/* ���²���Ҫ�ı� */

	// ����������������Ҫ�ڹ�����ʼ����ʱ��
	private CalPriceFactory() {
		init();
	}

	// �ڹ�����ʼ��ʱҪ��ʼ�������б�
	private void init() {
		calPriceList = new ArrayList<Class<? extends CalPrice>>();
		File[] resources = getResources();// ��ȡ���������е�class�ļ�
		Class<CalPrice> calPriceClazz = null;
		try {
			calPriceClazz = (Class<CalPrice>) classLoader
					.loadClass(CalPrice.class.getName());// ʹ����ͬ�ļ��������ز��Խӿ�
		} catch (ClassNotFoundException e1) {
			throw new RuntimeException("δ�ҵ����Խӿ�");
		}
		for (int i = 0; i < resources.length; i++) {
			try {
				// ������µ���
				Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "."
						+ resources[i].getName().replace(".class", ""));
				// �ж��Ƿ���CalPrice��ʵ���ಢ�Ҳ���CalPrice����������Ļ����뵽�����б�
				if (CalPrice.class.isAssignableFrom(clazz)
						&& clazz != calPriceClazz) {
					calPriceList.add((Class<? extends CalPrice>) clazz);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	// ��ȡɨ��İ��������е�class�ļ�
	private File[] getResources() {
		try {
			File file = new File(classLoader.getResource(
					CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
			return file.listFiles(new FileFilter() {
				public boolean accept(File pathname) {
					if (pathname.getName().endsWith(".class")) {// ����ֻɨ��class�ļ�
						return true;
					}
					return false;
				}
			});
		} catch (URISyntaxException e) {
			throw new RuntimeException("δ�ҵ�������Դ");
		}
	}

	public static CalPriceFactory getInstance() {
		return CalPriceFactoryInstance.instance;
	}

	private static class CalPriceFactoryInstance {

		private static CalPriceFactory instance = new CalPriceFactory();
	}

}
