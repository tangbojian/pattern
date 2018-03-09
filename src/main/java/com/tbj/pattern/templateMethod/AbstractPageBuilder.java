package com.tbj.pattern.templateMethod;

public abstract class AbstractPageBuilder implements PageBuilder{
	
	private StringBuffer stringBuffer = new StringBuffer();

	@Override
	public String buildHtml() {
		//���ȼ��� doctype ����Ϊ���� html ҳ�棬�������Ǹ��಻��Ҫ�Ƴٸ�����ʵ�֣�ֱ���ڸ���ʵ��
		stringBuffer.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">");
		//ҳ��������ǳɶԵ�һ��HTML��ǩ������Ҳ�ڸ�����룬����Ҫ������ʵ��
		stringBuffer.append("<html xmlns=\"http://www.w3.org/1999/xhtml\">");
		//�����Ӧ����head��ǩ��������ˣ�������Ǹ�������������,�Ƴٵ�����ʵ�֣��������Ƕ���һ�����󷽷������������ʵ��
		appendHead(stringBuffer);
		//�����Ӧ����body��ǩ����,������Ǹ���Ҳ������ס���Ƴٵ�����ʵ�֣��������Ƕ���һ�����󷽷������������ʵ��
		appendBody(stringBuffer);
		//html��ǩ�Ĺر�
        stringBuffer.append("</html>");
        return stringBuffer.toString();
	}

	//����body���ݵ�ʵ��
	protected abstract void appendBody(StringBuffer stringBuffer);

	//����Head��ʵ��
	protected abstract void appendHead(StringBuffer stringBuffer);

}
