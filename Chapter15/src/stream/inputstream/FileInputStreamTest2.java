package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	// while���� �̿��Ͽ� ���� ������ �ݺ��Ͽ� �б�
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");
			int i;
			
			// read()�� �ҷ��� ������ ���� �� -1�� ��ȯ�ǹǷ�
			// ������ ������ ���� ������ ���ư��� �ݺ���
			while((i = fis.read()) != -1) {
				System.out.print((char)i);
			} 
			System.out.println();
			System.out.println("��");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
