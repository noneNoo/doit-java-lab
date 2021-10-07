package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AloneGetClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// �̸����� Person Class ��������
		Class c1 = Person.class;
		
		// Person Class�� ��� ������ ��������
		Constructor[] cons = c1.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("===");
		
		// Person Class�� ��� ������� ��������
		Field[] fields = c1.getFields();
		for (Field f : fields) {
			System.out.println(f);
			System.out.println(f.getName());
		}
		
		System.out.println("===");
		
		// Person Class�� ��� �޼��� ��������
		Method[] methods = c1.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
	}

}
