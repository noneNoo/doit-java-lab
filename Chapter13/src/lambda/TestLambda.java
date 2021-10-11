package lambda;

interface PrintString {
	void showString(String str);
}

// String 값을 리턴
interface ReturnString {
	String getString(String str);
}


public class TestLambda {
	public static void main(String[] args) {
		// 1. 람다식을 인터페이스형 변수에 대입하기
		PrintString lambdaStr = s -> System.out.println(s);
		//그 변수를 사용하여 람다식 구현부 호출하기
		lambdaStr.showString("Lambda 1");
		
		// 반환도 된다 1
		ReturnString returnLambdaString = s -> {
			return s;
		};
		System.out.println(returnLambdaString.getString("냐옹"));
		
		// 2. 람다식을 매개변수로 대입하기
		showMyString(lambdaStr);
		
		
		// 3-1. 람다식을 변수로 반환받기 
		PrintString reStr = returnString();
		
		reStr.showString("람다식");
	}
	
	// 정적클래스 (호출없이 사용가능)
	// 매개변수로 구현된 람다식 인터페이스형을 받음
	public static void showMyString (PrintString p) {
		// 구현된 인터페이스의 메서드를 사용
		p.showString("Lambda 2");
	}
	
	
	// 3-2. 람다식을 반환하는 메서드
	public static PrintString returnString() {
		return s -> System.out.println(s + ", world!");
	}

}
