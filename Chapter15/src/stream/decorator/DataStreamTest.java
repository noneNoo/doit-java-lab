package stream.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	// DataStream 보조스트림은 자료형을 유지하여 데이터 자체를 복사해온다.
	// 자료형에 맞게 Input Output이 가능하다.
	// 자바의 입출력 스트림은 데코레이터(기능이 동적으로 추가되는) 패턴이다.
	public static void main(String[] args) {
		//data.txt 를 생성
		try(FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos)) {
			
			// 각 자료형에 맞는 자료를 작성
			
			 dos.writeByte(100);
			 dos.writeChar('A');
			 dos.writeInt(10);
			 dos.writeFloat(3.14f);
			 dos.writeUTF("TEST");
			 dos.writeUTF("아이돌마스터");
			 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// data.txt를 읽음
		try(FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis)) {

			// 자료형에 맞게, 쓴 순서대로, 읽어오기 때문에 
			// 메서드와 순서를 정확히 들어맞게 입력해야 한다.
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
