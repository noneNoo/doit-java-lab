package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BufferedStreamTest {

	public static void main(String[] args) {
		long millisecond = System.currentTimeMillis();
		
		try(FileInputStream fis = new FileInputStream("idols.zip");
			FileOutputStream fos = new FileOutputStream("idolsCopy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				) {
			
			int i;
			
			while((i = bis.read())!= -1) {
				bos.write(i);
			}
			
			millisecond = (System.currentTimeMillis()) - millisecond;
			System.out.println("복사 완료.");
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("걸린 시간(밀리초) : " + millisecond);
	}

}
