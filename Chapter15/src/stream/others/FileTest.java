package stream.others;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {

	// 파일 클래스: 파일 생성 및 파일 자체의 경로, 정보를 알 수 있음
	public static void main(String[] args) throws IOException {
		
		File file = new File("./newFile.txt");
		file.createNewFile();
		
		try(FileWriter fw = new FileWriter(file)){
			
			fw.write("아이돌마스터샤이니컬러즈");
			System.out.println("파일을 생성했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileReader fr = new FileReader(file)) {
			System.out.println("파일을 읽습니다.");
			int i;
			while ((i = fr.read()) != -1) {
				System.out.print((char)i);
			}
			System.out.println();
		}catch (IOException e) {
			e.printStackTrace();
		}
		

		System.out.println();
		
		System.out.println("파일 유무: " + file.isFile());
		System.out.println("파일이 디렉토리인가? " + file.isDirectory());
		System.out.println("파일명:" + file.getName());
		System.out.println("파일 절대경로:" + file.getAbsolutePath());
		System.out.println("파일 상대경로:" + file.getPath());
		System.out.println("파일을 읽을 수 있는가? " + file.canRead());
		System.out.println("파일에 입력할 수 있는가? " + file.canWrite());
		
		file.delete();
		System.out.println("삭제되었습니다.");
		System.out.println("파일 유무: " + file.isFile());
	}

}
