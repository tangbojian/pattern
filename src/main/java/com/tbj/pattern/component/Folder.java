package com.tbj.pattern.component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjtang
 * @date   2017年8月8日  
 * @desc   文件夹类
 */
public class Folder implements IFile {
	
	/**名称*/
	private String name;
	/**标记当前的自己,可以要可以不要,不要的话,把下面的folder改为this即可*/
	private IFile folder;
	/**文件下的文件和文件夹*/
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
		System.out.println("--------------删除子文件---------");
		for(IFile file : copy){
			file.delete();
		}
		System.out.println("--------------删除子结束---------");
		if(folder != null){
			folder.deleteFile(name);
		}
		System.out.println("---删除[" + name + "]---");
		
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
