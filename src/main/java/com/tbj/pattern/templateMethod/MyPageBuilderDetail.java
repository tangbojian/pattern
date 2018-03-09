package com.tbj.pattern.templateMethod;

public class MyPageBuilderDetail extends AbstractPageBuilderDetail {

	@Override
	protected void appendMeta(StringBuffer stringBuffer) {
		stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");;
	}

	@Override
	protected void appendTitle(StringBuffer stringBuffer) {
		stringBuffer.append("<title>���</title>");
	}

	@Override
	protected void appendBody(StringBuffer stringBuffer) {
		stringBuffer.append("<body>��ã����磡</body>");
	}

	public static void main(String[] args) {
		PageBuilder pageBuilder = new MyPageBuilder();
		System.out.println(pageBuilder.buildHtml());
	}

}
