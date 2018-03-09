package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017年8月8日  
 * @desc   文件系统中的节点接口
 */
public interface IFile {

	//下面两个方法，相当于类图中的Operation方法，就是文件和文件夹共同拥有的行为
	void delete();
	String getName();
	
	/**以上是公共行为，以下文件夹才有的行为*/

	//在文件夹下面创建新文件
	void createNewFile(String name);
	//删除文件夹下的文件
	void deleteFile(String name);
	//得到文件夹下面的文件列表
	IFile getIFile(int index);
	
}
