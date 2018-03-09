package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017年8月8日  
 * @desc   文件类
 */
public class File implements IFile{
	
	private String name;
	
	private IFile folder;
	
	public File(String name, IFile folder) {
		super();
		this.name = name;
		this.folder = folder;
	}

	@Override
	public void delete() {
		folder.deleteFile(name);
		System.out.println("----删除[" + name + "]----");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void createNewFile(String name) {
		throw new UnSupportOperationException("文件不支持创建新文件");
	}

	@Override
	public void deleteFile(String name) {
		throw new UnSupportOperationException("文件不支持删除文件");
	}

	@Override
	public IFile getIFile(int index) {
		throw new UnSupportOperationException("文件不支持获取下面的文件列表");
	}

}
