package string;

public class StringTest1 {

	public static void main(String[] args) {
		
		
		// 1. 인스턴스를 새로 생성하는 방식.
		
		// 두 개의 새 인스턴스가 생성된다. 주소값 또한 서로 다르다.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 주소값이 다름을 확인. false
		System.out.println(str1 == str2);
		// 문자열 값이 같으므로 true
		System.out.println(str1.equals(str2));
		
		// ======
		
		// 2. 상수풀에 미리 저장된 값을 대입하는 방식
		
		// 프로그램 실행과 동시에 상수풀에 abc라는 값이 저장된다
		// 그러므로 둘은 같은 주소값을 가리키게 된다.
		String str3 = "abc";
		String str4 = "abc";
		
		// 상수풀의 같은 주소값 가리킴. true
		System.out.println(str3 == str4);
		// 문자열 값도 같으므로 true
		System.out.println(str3.equals(str4));
	}

}
