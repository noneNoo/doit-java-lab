package interfaceex;

public class MyClassTest {

	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		// 상위 인터페이스 x형으로 대입하면 x에서 선언한 메서드만 사용 가능
		X xClass = mClass;
		xClass.x();
		
		// 상위 인터페이스 y형으로 대입하면 y에서 선언한 메서드만 사용 가능
		Y yClass = mClass;
		yClass.y();
		
		// 구현한 인터페이스형 변수에 대입하면
		// 인터페이스가 상속한 모든 메서드 사용 가능!
		MyInterface iClass = mClass;
		iClass.x();
		iClass.y();
	}

}
