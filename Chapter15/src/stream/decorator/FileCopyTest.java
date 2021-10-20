package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		// zip���� �����ϴ� ������Ʈ�� ���

		long millisecond = 0;
		
		try(FileInputStream fis = new FileInputStream("a.zip");
			FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			//������ �����ϱ� �� �ð� ����
			millisecond = System.currentTimeMillis();
			
			int i;
			
			// ���� �ҷ��ͼ�
			while((i = fis.read()) != -1) {
				// ���
				fos.write(i);
			}
			
			// ������ �����ϰ� �� ���� �ð� ����
			millisecond = (System.currentTimeMillis()) - millisecond;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� �����ϴ� �� " + millisecond +"millisecond �ɷȽ��ϴ�.");
	}

}
