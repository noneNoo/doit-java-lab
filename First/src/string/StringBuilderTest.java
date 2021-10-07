package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		// 변경 가능한 StringBuilder 클래스
		// 인자로 String Object를 받아옴
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// buffer에 문자열 추가
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!");
		
		// 연산 후 메모리 주소 확인. 바뀌지 않았음
		System.out.println("연산 후 buffer 메모리 주소: " + System.identityHashCode(buffer));
		
		// String class로 변환하여 대입
		javaStr = buffer.toString();
		
		System.out.println("새로 만들어진 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
		
		
	}

}
