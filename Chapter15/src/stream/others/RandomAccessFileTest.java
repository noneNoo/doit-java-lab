package stream.others;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	// 파일 입출력을 동시에 할 수 있는 RandomAccessFileTest 클래스
	// 파일 포인터로 파일이 어느 위치에서 읽고 쓰고 있는지 확인이 가능하다.
	
	public static void main(String[] args) throws IOException {
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		
		rf.writeInt(100);
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		rf.writeDouble(3.14);
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());
		
		rf.writeUTF("안녕하세요. 문자열도 됩니다.");
		System.out.println("파일 포인터 위치: " + rf.getFilePointer());


		// 파일 포인터의 위치를 0으로 옮겨서 처음부터 읽을 수 있게 한다.
		rf.seek(0);

		System.out.println("초기화된 파일 포인터 위치:" + rf.getFilePointer());
		
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println("파일 포인터 위치:" + rf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
	}

}
