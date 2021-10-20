package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// zip파일 복사하는 보조스트림 사용

		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			//파일을 복사하기 전 시간 저장
			millisecond = System.currentTimeMillis();
			
			int i;
			
			// 파일 불러와서
			while((i = fis.read()) != -1) {
				// 출력
				fos.write(i);
			}
			
			// 파일을 복사하고 난 후의 시간 저장
			millisecond = (System.currentTimeMillis()) - millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 복사하는 데 " + millisecond +"millisecond 걸렸습니다.");
	}

}
