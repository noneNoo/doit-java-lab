package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			
			// 파일의 끝에 도달할(-1반환할) 때까지 배열 bs를 매개변수로 넣는다
			while((i = fis.read(bs)) != -1) {
//				for(byte b : bs) {
//					System.out.print((char)b);
//				}
				for(int k = 0; k < i; k ++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("끝");
	}

}
