package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {

	// 리플렉션: 클래스의 자료형을 모르는 상태에서 그 클래스의 정보를 알아내고
	// 이 정보를 이용하여 인스턴스를 생성하거나 메서드를 호출하는 방식
	
	public static void main(String[] args) throws ClassNotFoundException {
		// 이름으로 자바의 String Class 찾기
		// String Class를 리플렉션하기 위해 정보를 출력해볼 것이다.
		Class strClass = Class.forName("java.lang.String");
		
		// 모든 생성자 가져와서 출력해보기
		Constructor[] cons = strClass.getConstructors();
		for (Constructor consItem : cons) {
			System.out.println(consItem);
		}
		
		System.out.println(" ====== Field ===== ");
		
		// 모든 멤버변수 가져와 출력하기
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
