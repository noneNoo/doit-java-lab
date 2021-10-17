package stream.inputstream;

import java.io.IOException;

public class SystemInTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요.");
		
		int i;
		try {
			i = System.in.read();	// read메서드로 한 바이트를 읽는다.
			System.out.println(i);
			System.out.println((char)i);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
