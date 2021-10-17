package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// 문자를 출력하는 것이므로 아스키코드 값을 써도 의미가 없다.
		// 정말 문자를 출력(write) 덜덜
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');	// 문자 하나 출력
			
			// 여러 문자 출력하기 위해 배열을 생성
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			char buf2[] = {'I','M', '@', 'S', '!'};
			
			fw.write(buf);
			fw.write(" 아이돌마스터 샤이니컬러즈 ");
			fw.write(buf, 0, 3);
			fw.write("65");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("출력이 완료되었습니다.");
	}

}
