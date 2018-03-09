package com.tbj.pattern.decorator.io;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.URL;

public class IOTest {

	public static void main(String[] args) throws Exception {
		
		//文件路径
		final URL filePath = IOTest.class.getClassLoader().getResource("file.xml");
		
		File file = new File(filePath.toURI());
		
		//InputStream 相当于被装饰的接口或者抽象类。FileInputStream相当于原始的带装饰的对象,FileInputStream 无法装饰InputStream
		//另外FileInputStream是以只读方式打开一个文件,并将打开文件的句柄存放在FileDescriptor对象的handle属性
		//所以下面有关回退和重新标记等操作，都是在堆中建立缓冲区所造成的假象,并不是真正的文件流在回退或者重新标记
		InputStream inputStream = new FileInputStream(file);
		final int available = inputStream.available(); //记录一下长度
		System.out.println("FileInputStream不支持mark和reset：" + inputStream.markSupported());
		System.out.println("---------------------------------------------------------------------------------");
		
		//下面分别展示三种装饰器的作用BufferedInputStream, DateInputStream, PushBackInputStream, LZ下面做了三个装饰器的功能演示
		
		//首先装饰成BufferedInputStream, 它提供我们 mark, reset的功能
		BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);//装饰成BufferedInputStream
		System.out.println("BufferedInputStream 支持mark和reset ：" +bufferedInputStream.markSupported());
		bufferedInputStream.mark(0);// 标记一下
		char c = (char)bufferedInputStream.read();
		System.out.println("LZ文件的第一个字符: " + c);
		c = (char)bufferedInputStream.read();
		System.out.println("LZ文件的第二个字符: " + c);
		bufferedInputStream.reset();//重置
		c = (char)bufferedInputStream.read();
		System.out.println("重置以后再读一个字符，依然会是第一个字符: " + c);
		
		System.out.println("---------------------------------------------------------------------------------");
		
		//装饰成 DataInputStream，我们为了又使用DataInputStream，有使用BufferedInputStream的 mark， reset功能，所以我们在进行一次包装
		//注意，这里如果不使用 BufferedInputStream， 而使用 InputStream, read 方法返回的结果会是 -1， 即已经读取结束
		//因为BufferedInputStream 已经将文本的内容读取完毕,并缓存到堆上，默认的初始缓存区大小是 8192B。
		DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
		dataInputStream.reset(); //重置到初始标记
		char read = (char)dataInputStream.read();
		System.out.println(read);
		System.out.println("DataInputStram 现在具有readInt， readChar， readUTF 等功能");
		int value = dataInputStream.readInt();  //读出一个int，包含四个字节
		//我们转换成字符依次显示出来,可以看到LZ文件的前四个字符
		String str = Integer.toBinaryString(value);
		System.out.println(str.length());
		int first = str.length() % 8;
        System.out.print("使用readInt读取的前四个字符：");
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
        
		//读取文件
    	//String readPath = System.getProperty("user.dir") + File.separatorChar + "sources" +  File.separatorChar + "006.jpg";
		System.out.println(System.getProperty("user.dir") + File.separatorChar + "README.md");
		
	}
	
}
