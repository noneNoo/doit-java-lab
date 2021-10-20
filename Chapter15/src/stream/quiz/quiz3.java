package stream.quiz;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.io.IOException;
import java.io.FileNotFoundException;

public class quiz3 {

	// FileInputStream�� OutputStreamWriter ��
	// ���� ����غ�����.
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// �Է�
		try(FileOutputStream fos = new FileOutputStream("a.txt");
			// ���ڵ� ���
			OutputStreamWriter fw = new OutputStreamWriter(fos, "UTF-8")) {
			

			// ����� ������...
			String textData = "��... ���ϴ� ���̰� �̰�...";
			
			fw.write(textData);
			
			System.out.println("������ ������");
		} catch (IOException e) {
			e.printStackTrace();
		}

		// ��� �ƹ��� �� �������� �׳� �غ���.
		try(FileInputStream fis = new FileInputStream("a.txt");
			// ���ڵ� ���
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
