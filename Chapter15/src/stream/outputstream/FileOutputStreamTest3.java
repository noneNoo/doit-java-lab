package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	// n ~ 부터 n2 까지 출력(write)하기
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try(fos) {
			// 알파벳 바이트를 담을 배열을 생성
			byte[] bs = new byte[26];
			byte data = 65; 	// 알파벳 A
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data ++;
			}
			// 2번 배열부터 10번 배열까지 파일에 출력하겠다는 의미.
			fos.write(bs, 2, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("파일 출력이 완료되었습니다. 확인해보세요.");
	}

}
