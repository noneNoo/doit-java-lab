package chapter2;

public class CharacterEx1 {

	public static void main(String[] args) {
		char ch1 = 'Z';
		
		System.out.println(ch1);	// 문자 출력
		System.out.println((int)ch1);	// 문자에 해당되는 아스키 코드값 출력
		
		char ch2 = 38;	// 정수값 대입
		System.out.println(ch2);	// 정수값에 해당하는 아스키 코드 문자를 출력
		
		int ch3 = 97;
		System.out.println(ch3);	// 정수값 출력
		System.out.println((char)ch3);	// 정수값에 해당하는 아스키 코드 문자를 출력

	}

}
