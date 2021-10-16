package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	// stream객체로 자바에서 파일을 읽고 쓸 수 있다.
	// 여태껏 클래스를 생성하던 코드와 별반 다를 게 없다...
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("여기도 실행됩니다.");
		System.out.println("예외가 발생했음에도 비정상 종료가 되지 않았다.");
	}

}
