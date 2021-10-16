package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
	// loadClass 라는 메서드를 정의.
	// throws로 예외 처리를 미룬다고 예고.
	public Class loadClass(String fileName, String className) throws
	// 두 가지 예외가 발생할 시,
	// 메서드가 호출될 때까지 처리하도록 미룬다.
	FileNotFoundException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(fileName); // FileNotFoundException 발생 가능
		Class c = Class.forName(className);		// ClassNotFoundException 발생 가능
		return c;
	}

	public static void main(String[] args) {
		ThrowsException test = new ThrowsException();
		//아래 메서드가 호출될 때 예외를 처리한다. (위에 놈이 미뤘기 때문)
		
		// 1. multi-catch: 여러가지 예외를 한 문장으로 처리한다.
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// 여러 예외를 한 문장으로 처리한다.
			e.printStackTrace();
			System.out.println("에러가 났음 아무튼 났음.");
		} 
		
		System.out.println(" === ");
		// 2. with-catch: 여러 예외를 각각 처리한다.
		try {
			// 없는 파일과 없는 클래스를 가져오려고 시도중
			test.loadClass("a.txt", "java.lang.sibaloma");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("에러: 파일을 찾을 수 없습니다.");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("에러: 클래스를 찾을 수 없습니다.");
			
			// 디폴트 예외처리
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("에러: 그 외 에러가 발생할 시...");
		}
		System.out.println("뭥미");
	}

}
