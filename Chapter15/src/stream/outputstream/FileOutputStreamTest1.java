package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	// 파일에 한 바이트씩 출력하기
	public static void main(String[] args) {
		// FileOutputStream을 생성하고, write()메서드를 이용하여 파일에 정수값을 저장하는 예제.
		
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
		

	}

}
