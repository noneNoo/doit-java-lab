package string;

public class StringTest2 {
// 문자열 연결 테스트
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("처음 문자열 값 : " + System.identityHashCode(javaStr));
		
		// 두 문자열을 결합하여 재선언
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		// 새로 생성된 문자열 값을 가리킨다.
		System.out.println("연결된 문자열 값: " + System.identityHashCode(javaStr));
		
	}

}
