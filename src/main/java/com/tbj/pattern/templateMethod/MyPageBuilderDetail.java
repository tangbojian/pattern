package com.tbj.pattern.templateMethod;

public class MyPageBuilderDetail extends AbstractPageBuilderDetail {

	@Override
	protected void appendMeta(StringBuffer stringBuffer) {
		stringBuffer.append("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />");;
	}

	@Override
	protected void appendTitle(StringBuffer stringBuffer) {
		stringBuffer.append("<title>你好</title>");
	}

	@Override
	protected void appendBody(StringBuffer stringBuffer) {
		stringBuffer.append("<body>你好，世界！</body>");
	}

	public static void main(String[] args) {
		PageBuilder pageBuilder = new MyPageBuilder();
		System.out.println(pageBuilder.buildHtml());
	}

}
