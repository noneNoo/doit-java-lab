package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	// loadClass ��� �޼��带 ����.
	// throws�� ���� ó���� �̷�ٰ� ����.
	public Class loadClass(String fileName, String className) throws
	// �� ���� ���ܰ� �߻��� ��,
	// �޼��尡 ȣ��� ������ ó���ϵ��� �̷��.
	FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException �߻� ����
		Class c = Class.forName(className);		// ClassNotFoundException �߻� ����
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		//�Ʒ� �޼��尡 ȣ��� �� ���ܸ� ó���Ѵ�. (���� ���� �̷�� ����)
		
		// 1. multi-catch: �������� ���ܸ� �� �������� ó���Ѵ�.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// ���� ���ܸ� �� �������� ó���Ѵ�.
			e.printStackTrace();
			System.out.println("������ ���� �ƹ�ư ����.");
		} 
		
		System.out.println(" === ");
		// 2. with-catch: ���� ���ܸ� ���� ó���Ѵ�.
		try {
			// ���� ���ϰ� ���� Ŭ������ ���������� �õ���
			test.loadClass("a.txt", "java.lang.sibaloma");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("����: ������ ã�� �� �����ϴ�.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("����: Ŭ������ ã�� �� �����ϴ�.");
			
			// ����Ʈ ����ó��
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("����: �� �� ������ �߻��� ��...");
		}
		System.out.println("�o��");
	}

}
