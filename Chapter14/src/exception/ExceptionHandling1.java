package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling1 {

	// stream��ü�� �ڹٿ��� ������ �а� �� �� �ִ�.
	// ���²� Ŭ������ �����ϴ� �ڵ�� ���� �ٸ� �� ����...
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("a.text");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("���⵵ ����˴ϴ�.");
		System.out.println("���ܰ� �߻��������� ������ ���ᰡ ���� �ʾҴ�.");
	}

}
