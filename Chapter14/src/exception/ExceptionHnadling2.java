package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHnadling2 {

	public static void main(String[] args) {
		// �� ���Ƿ� �ֱ�
		FileInputStream fis = null;
		
		
		try {
			fis = new FileInputStream("a.txt");
		} catch(FileNotFoundException e) {
			System.out.println(e);
			return;
		} finally {
			// finally�� return�� �Ǿ ����ȴ�.
			// fis�� null �� �ƴ� ��쿡�� close
			if(fis != null) {
				try {
				fis.close();
				} catch (IOException e) {
					// ��𿡼� ���ܰ� �߻��ߴ��� ���󰡴� �޼���
					e.printStackTrace();
				}
			}
			System.out.println("finally. try����� ���� �Ǹ� �׻� ����˴ϴ�.");
		}
		System.out.println("����ó���� ���� �� �ڵ�.");
		System.out.println("�����ع����� ������ ���� �ʽ��ϴ�.");
	}

}
