package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	// 향상된 Try Catch문을 사용하기 위해 throws 를 사용한다.
	public static void main(String[] args) throws IOException{
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos) {
			byte[] bs = new byte[26]; // byte를 담을 수 있는 26크기의 배열
			byte data = 65; // A 의 아스키 값
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data++;
			}
			fos.write(bs);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 출력이 완료되었습니다. 확인해보세요.");
	}

}
