package stream.quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
import java.io.FileNotFoundException;

public class quiz3 {

	// FileInputStream과 OutputStreamWriter 로
	// 말을 출력해보세요.
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 입력
		try(FileOutputStream fos = new FileOutputStream("a.txt");
			// 인코딩 방식
			OutputStreamWriter fw = new OutputStreamWriter(fos, "UTF-8")) {
			

			// 출력할 데이터...
			String textData = "아... 머하는 짓이고 이게...";
			
			fw.write(textData);
			
			System.out.println("파일이 생성됨");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 출력 아무도 안 시켰지만 그냥 해본다.
		try(FileInputStream fis = new FileInputStream("a.txt");
			// 인코딩 방식
			InputStreamReader isr = new InputStreamReader(fis,"UTF-8")) {
			int i;
			while((i = isr.read()) != -1) {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
