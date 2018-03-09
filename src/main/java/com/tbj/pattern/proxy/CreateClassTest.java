package com.tbj.pattern.proxy;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import sun.misc.ProxyGenerator;

public class CreateClassTest {
	

	public static void main(String[] args) throws IOException {
		
		byte[] classFile = ProxyGenerator.generateProxyClass("TestProxy", new Class[]{TestInterface.class});
        File file = new File("E:/TestProxy.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
        
        
		
	}
	
}
