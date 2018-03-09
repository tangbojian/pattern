package com.tbj.pattern.component;

/**
 * @author bjtang
 * @date 2017��8��8��
 * @desc ������
 */
public class Client {

	public static void main(String[] args) {

		IFile root = new Folder("�ҵĵ���");
		root.createNewFile("C��");
		root.createNewFile("D��");
		root.createNewFile("E��");
		IFile D = root.getIFile(1);
		D.createNewFile("project");
		D.createNewFile("��Ӱ");

		IFile project = D.getIFile(0);
		project.createNewFile("test1.java");
		project.createNewFile("test2.java");
		project.createNewFile("test3.java");

		IFile movie = D.getIFile(1);
		movie.createNewFile("���ഺ.avi");
		movie.createNewFile("�ٶ��뼤��.avi");

		/* ����Ϊ��ǰ�ļ�ϵͳ��������������ǳ���ɾ���ļ����ļ��� */
		display(null, root);
		System.out.println();

		project.delete();
		movie.getIFile(1).delete();

		System.out.println();
		display(null, root);
	}

	private static void display(String prefix, IFile iFile) {
		if (prefix == null) {
			prefix = "";
		}
		System.out.println(prefix + iFile.getName());
		if (iFile instanceof Folder) {
			for (int i = 0;; i++) {
				try {
					if (iFile.getIFile(i) != null) {
						display(prefix + "--", iFile.getIFile(i));
					}
				} catch (Exception e) {
					break;
				}
			}
		}
	}

}
