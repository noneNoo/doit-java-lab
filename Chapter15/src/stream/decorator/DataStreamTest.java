package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	// DataStream ������Ʈ���� �ڷ����� �����Ͽ� ������ ��ü�� �����ؿ´�.
	// �ڷ����� �°� Input Output�� �����ϴ�.
	// �ڹ��� ����� ��Ʈ���� ���ڷ�����(����� �������� �߰��Ǵ�) �����̴�.
	public static void main(String[] args) {
		//data.txt �� ����
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)) {
			
			// �� �ڷ����� �´� �ڷḦ �ۼ�
			
			 dos.writeByte(100);
			 dos.writeChar('A');
			 dos.writeInt(10);
			 dos.writeFloat(3.14f);
			 dos.writeUTF("TEST");
			 dos.writeUTF("���̵�������");
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// data.txt�� ����
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)) {

			// �ڷ����� �°�, �� �������, �о���� ������ 
			// �޼���� ������ ��Ȯ�� ���°� �Է��ؾ� �Ѵ�.
			System.out.println(dis.readByte());
			System.out.println(dis.readChar());
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
