package com.tbj.pattern.adapter;

import java.util.HashMap;
import java.util.Observable;
import java.util.Observer;

/**
 * ��������
 * @author bjtang
 * @date   2017��6��26��  
 * @desc   �����Ǽ̳�����ϣ�������书�ܵ��࣬����ʵ������������Ľӿڣ���������� Observer ����ô�ͻ����һ���������� �������������ԭ���� ���� HashMap���Ĺ��ܣ�
 * �־��й۲��߽ӿڣ�����������������ھͿ��Լ��뵽�۲����б��ˡ�
 * �������������ܼ򵥰ɣ�
 * @param <K>
 * @param <V>
 */
public class HashMapObserverAdpater<K, V> extends HashMap<K, V> implements Observer{

	private static final long serialVersionUID = -1700079324465155505L;

	@Override
	public void update(Observable o, Object arg) {
		//���۲��߱仯ʱ,���Map
	}

}
