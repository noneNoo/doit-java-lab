package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// FileInputStream 클래스를 넣어둘 자리 생성
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				// 무조건 닫아주기
				fis.close();
			} catch (IOException e) {
				System.out.println();
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
		}
		System.out.println("프로그램 종료");
	}

}
