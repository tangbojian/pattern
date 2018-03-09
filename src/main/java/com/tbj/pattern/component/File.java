package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date   2017��8��8��  
 * @desc   �ļ���
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
		System.out.println("----ɾ��[" + name + "]----");
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void createNewFile(String name) {
		throw new UnSupportOperationException("�ļ���֧�ִ������ļ�");
	}

	@Override
	public void deleteFile(String name) {
		throw new UnSupportOperationException("�ļ���֧��ɾ���ļ�");
	}

	@Override
	public IFile getIFile(int index) {
		throw new UnSupportOperationException("�ļ���֧�ֻ�ȡ������ļ��б�");
	}

}
