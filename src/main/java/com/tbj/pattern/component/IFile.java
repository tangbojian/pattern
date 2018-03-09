package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017��8��8��  
 * @desc   �ļ�ϵͳ�еĽڵ�ӿ�
 */
public interface IFile {

	//���������������൱����ͼ�е�Operation�����������ļ����ļ��й�ͬӵ�е���Ϊ
	void delete();
	String getName();
	
	/**�����ǹ�����Ϊ�������ļ��в��е���Ϊ*/

	//���ļ������洴�����ļ�
	void createNewFile(String name);
	//ɾ���ļ����µ��ļ�
	void deleteFile(String name);
	//�õ��ļ���������ļ��б�
	IFile getIFile(int index);
	
}
