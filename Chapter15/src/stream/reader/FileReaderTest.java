package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
	// 문자(한글 같은...)을 처리할 때는 Reader를 사용해야 파일이 깨지지 않는다.
	public static void main(String[] args) {
		try(FileReader fr = new FileReader("reader.txt")) {
			int i;
			
			// 파일이 끝날 때까지 반복문이 돌아감
			while((i = fr.read())!= -1) {
				System.out.print((char)i);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
