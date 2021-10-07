package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AloneGetClass {

	public static void main(String[] args) throws ClassNotFoundException {
		
		// 이름으로 Person Class 가져오기
		Class c1 = Person.class;
		
		// Person Class의 모든 생성자 가져오기
		Constructor[] cons = c1.getConstructors();
		for (Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("===");
		
		// Person Class의 모든 멤버변수 가져오기
		Field[] fields = c1.getFields();
		for (Field f : fields) {
			System.out.println(f);
			System.out.println(f.getName());
		}
		
		System.out.println("===");
		
		// Person Class의 모든 메서드 가져오기
		Method[] methods = c1.getMethods();
		for (Method m : methods) {
			System.out.println(m);
		}
		
	}

}
