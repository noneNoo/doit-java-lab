package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest3 {
	// n ~ ���� n2 ���� ���(write)�ϱ�
	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("output3.txt");
		try(fos) {
			// ���ĺ� ����Ʈ�� ���� �迭�� ����
			byte[] bs = new byte[26];
			byte data = 65; 	// ���ĺ� A
			
			for(int i = 0; i < bs.length; i++) {
				bs[i] = data;
				data ++;
			}
			// 2�� �迭���� 10�� �迭���� ���Ͽ� ����ϰڴٴ� �ǹ�.
			fos.write(bs, 2, 10);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ����� �Ϸ�Ǿ����ϴ�. Ȯ���غ�����.");
	}

}
