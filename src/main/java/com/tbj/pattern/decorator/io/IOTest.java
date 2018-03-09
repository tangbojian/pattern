package com.tbj.pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class IOTest {

	public static void main(String[] args) throws Exception {
		
		//�ļ�·��
		final URL filePath = IOTest.class.getClassLoader().getResource("file.xml");
		
		File file = new File(filePath.toURI());
		
		//InputStream �൱�ڱ�װ�εĽӿڻ��߳����ࡣFileInputStream�൱��ԭʼ�Ĵ�װ�εĶ���,FileInputStream �޷�װ��InputStream
		//����FileInputStream����ֻ����ʽ��һ���ļ�,�������ļ��ľ�������FileDescriptor�����handle����
		//���������йػ��˺����±�ǵȲ����������ڶ��н�������������ɵļ���,�������������ļ����ڻ��˻������±��
		InputStream inputStream = new FileInputStream(file);
		final int available = inputStream.available(); //��¼һ�³���
		System.out.println("FileInputStream��֧��mark��reset��" + inputStream.markSupported());
		System.out.println("---------------------------------------------------------------------------------");
		
		//����ֱ�չʾ����װ����������BufferedInputStream, DateInputStream, PushBackInputStream, LZ������������װ�����Ĺ�����ʾ
		
		//����װ�γ�BufferedInputStream, ���ṩ���� mark, reset�Ĺ���
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);//װ�γ�BufferedInputStream
		System.out.println("BufferedInputStream ֧��mark��reset ��" +bufferedInputStream.markSupported());
		bufferedInputStream.mark(0);// ���һ��
		char c = (char)bufferedInputStream.read();
		System.out.println("LZ�ļ��ĵ�һ���ַ�: " + c);
		c = (char)bufferedInputStream.read();
		System.out.println("LZ�ļ��ĵڶ����ַ�: " + c);
		bufferedInputStream.reset();//����
		c = (char)bufferedInputStream.read();
		System.out.println("�����Ժ��ٶ�һ���ַ�����Ȼ���ǵ�һ���ַ�: " + c);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//װ�γ� DataInputStream������Ϊ����ʹ��DataInputStream����ʹ��BufferedInputStream�� mark�� reset���ܣ����������ڽ���һ�ΰ�װ
		//ע�⣬���������ʹ�� BufferedInputStream�� ��ʹ�� InputStream, read �������صĽ������ -1�� ���Ѿ���ȡ����
		//��ΪBufferedInputStream �Ѿ����ı������ݶ�ȡ���,�����浽���ϣ�Ĭ�ϵĳ�ʼ��������С�� 8192B��
		DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
		dataInputStream.reset(); //���õ���ʼ���
		char read = (char)dataInputStream.read();
		System.out.println(read);
		System.out.println("DataInputStram ���ھ���readInt�� readChar�� readUTF �ȹ���");
		int value = dataInputStream.readInt();  //����һ��int�������ĸ��ֽ�
		//����ת�����ַ�������ʾ����,���Կ���LZ�ļ���ǰ�ĸ��ַ�
		String str = Integer.toBinaryString(value);
		System.out.println(str.length());
		int first = str.length() % 8;
        System.out.print("ʹ��readInt��ȡ��ǰ�ĸ��ַ���");
        for (int i = 0; i < 4; i++) {
            if (i == 0) {
                System.out.print(((char)Integer.valueOf(str.substring(0, first), 2).intValue()));
            }else {
                System.out.print(((char)Integer.valueOf(str.substring(( i - 1 ) * 8 + first, i * 8 + first), 2).intValue()));
            }
        }
        
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        
        //http://www.cnblogs.com/zuoxiaolong/p/pattern11.html
        
		//��ȡ�ļ�
    	//String readPath = System.getProperty("user.dir") + File.separatorChar + "sources" +  File.separatorChar + "006.jpg";
		System.out.println(System.getProperty("user.dir") + File.separatorChar + "README.md");
		
	}
	
}
