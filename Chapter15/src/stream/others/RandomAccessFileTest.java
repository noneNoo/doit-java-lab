package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	// ���� ������� ���ÿ� �� �� �ִ� RandomAccessFileTest Ŭ����
	// ���� �����ͷ� ������ ��� ��ġ���� �а� ���� �ִ��� Ȯ���� �����ϴ�.
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		
		rf.writeDouble(3.14);
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());
		
		rf.writeUTF("�ȳ��ϼ���. ���ڿ��� �˴ϴ�.");
		System.out.println("���� ������ ��ġ: " + rf.getFilePointer());


		// ���� �������� ��ġ�� 0���� �Űܼ� ó������ ���� �� �ְ� �Ѵ�.
		rf.seek(0);

		System.out.println("�ʱ�ȭ�� ���� ������ ��ġ:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("���� ������ ��ġ:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
