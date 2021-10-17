package stream.others;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// console 클래스를 반환
		// Console은 이클립스 환경에서 실행할 수 없다. 따로 터미널창에서 출력해야 한다.
		Console console = System.console();
		
		System.out.println("이름:");
		String name = console.readLine();
		System.out.println("직업:");
		String job = console.readLine();
		System.out.println("비밀번호:");
		// char로 패스워드를 하나하나 받아온다...?
		char[] password = console.readPassword();
		String strpass = new String(password);
		
		System.out.println("이름: " + name);
		System.out.println("직업: " + job);
		System.out.println("비밀번호: " + strpass);
		System.out.println(password);
	}

}
