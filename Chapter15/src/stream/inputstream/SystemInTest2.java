package stream.inputstream;

import java.io.IOException;

public class SystemInTest2 {

	public static void main(String[] args) {
		// ���� ���� ���� �Է� �ޱ�
		
		System.out.println("���ĺ� ���� ���� ���� [Enter]�� ��������.");
		
		int i;
		
		try {
			// ���� Ű�� ������ ������ �Է��� ��� �޴´�.
			while((i = System.in.read()) != '\n') {
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
