package com.tbj.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjtang
 * @date   2017��8��8��  
 * @desc   �ļ�����
 */
public class Folder implements IFile {
	
	/**����*/
	private String name;
	/**��ǵ�ǰ���Լ�,����Ҫ���Բ�Ҫ,��Ҫ�Ļ�,�������folder��Ϊthis����*/
	private IFile folder;
	/**�ļ��µ��ļ����ļ���*/
	private List<IFile> files;
	
	public Folder(String name) {
		this(name, null);
	}
	
	public Folder(String name, IFile folder) {
		this.name = name;
		this.folder = folder;
		this.files = new ArrayList<IFile>();
	}

	@Override
	public void delete() {
		List<IFile> copy = new ArrayList<IFile>(files);
		System.out.println("--------------ɾ�����ļ�---------");
		for(IFile file : copy){
			file.delete();
		}
		System.out.println("--------------ɾ���ӽ���---------");
		if(folder != null){
			folder.deleteFile(name);
		}
		System.out.println("---ɾ��[" + name + "]---");
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void createNewFile(String name) {
		if(name.contains(".")){
			files.add(new File(name, this));
		}else{
			files.add(new Folder(name, this));
		}
	}

	@Override
	public void deleteFile(String name) {
		for(IFile file : files){
			if(file.getName().equals(name)){
				files.remove(file);
				break;
			}
		}
	}

	@Override
	public IFile getIFile(int index) {
		return files.get(index);
	}

}
