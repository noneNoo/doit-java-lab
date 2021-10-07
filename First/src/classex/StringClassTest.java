package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	// ���÷���: Ŭ������ �ڷ����� �𸣴� ���¿��� �� Ŭ������ ������ �˾Ƴ���
	// �� ������ �̿��Ͽ� �ν��Ͻ��� �����ϰų� �޼��带 ȣ���ϴ� ���
	
	public static void main(String[] args) throws ClassNotFoundException {
		// �̸����� �ڹ��� String Class ã��
		// String Class�� ���÷����ϱ� ���� ������ ����غ� ���̴�.
		Class strClass = Class.forName("java.lang.String");
		
		// ��� ������ �����ͼ� ����غ���
		Constructor[] cons = strClass.getConstructors();
		for (Constructor consItem : cons) {
			System.out.println(consItem);
		}
		
		System.out.println(" ====== Field ===== ");
		
		// ��� ������� ������ ����ϱ�
		Field[] fields = strClass.getFields();
		
		for (Field fieldItem : fields) {
			System.out.println(fieldItem);
		}

		System.out.println(" ====== Method ===== ");
		
		Method[] methods = strClass.getMethods();
		
		for (Method methodItem : methods) {
			System.out.println(methodItem);
		}
	}

}
