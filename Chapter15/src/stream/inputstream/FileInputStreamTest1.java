package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		// FileInputStream Ŭ������ �־�� �ڸ� ����
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				// ������ �ݾ��ֱ�
				fis.close();
			} catch (IOException e) {
				System.out.println();
			} catch (NullPointerException e2) {
				System.out.println(e2);
			}
		}
		System.out.println("���α׷� ����");
	}

}
