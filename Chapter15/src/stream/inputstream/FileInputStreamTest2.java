package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	// while문을 이용하여 파일 끝까지 반복하여 읽기
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			int i;
			
			// read()로 불러올 내용이 없을 시 -1이 반환되므로
			// 파일의 내용이 끝날 때까지 돌아가는 반복문
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			} 
			System.out.println();
			System.out.println("끝");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
