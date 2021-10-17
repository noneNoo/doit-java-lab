package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	// ���Ͽ� �� ����Ʈ�� ����ϱ�
	public static void main(String[] args) {
		// FileOutputStream�� �����ϰ�, write()�޼��带 �̿��Ͽ� ���Ͽ� �������� �����ϴ� ����.
		
		try(FileOutputStream fos = new FileOutputStream("output.txt", true)) {
			fos.write(65);
			fos.write(66);
			fos.write(67);
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("����� �Ϸ�Ǿ����ϴ�.");
		

	}

}
