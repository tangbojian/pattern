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
 * @date 2017��6��9��
 * @desc ����ע��ļ򵥹���:���������ر�˵��һ�㣬���ǵĲ���ʵ������÷���һ�����У��������ǿ���ɨ���ض��İ������Լӿ��ʼ���ٶ�.
 */
@SuppressWarnings("unchecked")
public class CalPriceFactory {

	private static final String CAL_PRICE_PACKAGE = "com.tbj.pattern.strategy.actualCombat.upgrade"; //������һ������,��ʾ����ɨ����Եİ�.�����ҵİ���
	
	private ClassLoader classLoader = this.getClass().getClassLoader(); //�������(ϵͳ�������)
	
	private List<Class<? extends CalPrice>> calPriceList;  //�����б�
	
	
	public CalPrice createCalPrice(Customer customer){
		//�ڲ����б���Ҳ���
		for(Class<? extends CalPrice> clazz : calPriceList){
			//��ȡע������
			TotalValidRegion validRegion = handleAnnotation(clazz); 
			//�жϽ���Ƿ���ע������
			if(customer.getTotalAmount() > validRegion.min() && customer.getTotalAmount() < validRegion.max()){
				try {
					return clazz.newInstance();
				}  catch (Exception e) {
					throw new RuntimeException("���Ի��ʧ��");
				}
			}
		}
		throw new RuntimeException("���Ի��ʧ��");
	}

	
	//����ע��,���Ǵ���һ��������,��������ע��
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
	
	//�ڹ�����ʼ��ʱҪ��ʼ�������б�
	private void init(){
		calPriceList = new ArrayList<Class<? extends CalPrice>>();
		File[] resource = getResource(); //��ȡ�������е�class�ļ�
		Class<CalPrice> calPriceClazz = null;
		try {
			//��ȡ���Խӿڵ�Class
			calPriceClazz = (Class<CalPrice>) classLoader.loadClass(CalPrice.class.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("δ�ҵ����Խӿ�");
		}
		for(int i = 0; i < resource.length; i++){
			try {
				Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + resource[i].getName().replace(".class", ""));
				//isAssignableFrom:�����ж� ��A �� ��B �Ƿ���ͬ,���� ����һ����ĳ�����߽ӿ�
				if(CalPrice.class.isAssignableFrom(clazz) && clazz != calPriceClazz){
					calPriceList.add((Class<? extends CalPrice>) clazz);
				}
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
	//��ȡ������������Դ�ļ�
	private File[] getResource() {
		// TODO Auto-generated method stub
		try {
			//�õ�һ���ļ���
			File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
			//��ȡ���ļ��������е�.class�ļ�
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
			throw new RuntimeException("δ�ҵ�������Դ");
		}
	}
	
	//����
    private CalPriceFactory(){
        init();
    }
    
    //ʹ�þ�̬�ڲ���ķ�ʽʵ�ֵ���
    public static CalPriceFactory getInstance(){
    	return CalPriceFactoryInstance.instance;
    }
    
    private static class CalPriceFactoryInstance{
    	private static CalPriceFactory instance = new CalPriceFactory();
    } 
	

}
