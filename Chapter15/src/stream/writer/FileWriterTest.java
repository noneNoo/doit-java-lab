package stream.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) {
		// ���ڸ� ����ϴ� ���̹Ƿ� �ƽ�Ű�ڵ� ���� �ᵵ �ǹ̰� ����.
		// ���� ���ڸ� ���(write) ����
		try(FileWriter fw = new FileWriter("writer.txt")){
			fw.write('A');	// ���� �ϳ� ���
			
			// ���� ���� ����ϱ� ���� �迭�� ����
			char buf[] = {'B', 'C', 'D', 'E', 'F', 'G'};
			char buf2[] = {'I','M', '@', 'S', '!'};
			
			fw.write(buf);
			fw.write(" ���̵������� ���̴��÷��� ");
			fw.write(buf, 0, 3);
			fw.write("65");
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
	}

}
