package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;			// int i = 10으로 컴파일 됨.
		var j = 10.0;		// double j = 10.0으로 컴파일 됨.
		var str = "Hello";	// String str = "Hello"로 컴파일 됨.
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";		// 다른 문자열 대입 가능
		
		System.out.println(str);
		
		// str = 3; 이미 String형으로 컴파일 되었기 때문에 정수를 넣으면 오류 발생
	}

}
