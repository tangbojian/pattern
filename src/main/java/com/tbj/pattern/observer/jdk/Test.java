package com.tbj.pattern.observer.jdk;

public class Test {
	
	@org.junit.Test
	public void test1(){
		Author author1 = new Author();
		author1.setName("tbj");
		Author author2 = new Author();
		author2.setName("jyt");
		AuthorManage.addAuthor(author1);
		AuthorManage.addAuthor(author2);
		
		Reader reader = new Reader();
		reader.subscription("tbj");
		reader.setName("����1");
		Reader reader2 = new Reader();
		reader2.subscription("tbj");
		reader2.subscription("jyt");
		reader2.setName("����2");
		
		author1.addNovel("��ҹ����");
		
		author2.addNovel("����");
	}
	
}
