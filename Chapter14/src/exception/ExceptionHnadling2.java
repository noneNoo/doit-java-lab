package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHnadling2 {

	public static void main(String[] args) {
		// 빈값 임의로 넣기
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			// finally는 return이 되어도 실행된다.
			// fis가 null 이 아닌 경우에만 close
			if(fis != null) {
				try {
				fis.close();
				} catch (IOException e) {
					// 어디에서 예외가 발생했는지 따라가는 메서드
					e.printStackTrace();
				}
			}
			System.out.println("finally. try블록이 실행 되면 항상 실행됩니다.");
		}
		System.out.println("예외처리가 끝난 후 코드.");
		System.out.println("리턴해버려서 실행이 되지 않습니다.");
	}

}
