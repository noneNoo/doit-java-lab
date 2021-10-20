package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 이 클래스를 직렬화 하겠다는 의도를 표시하는 클래스를 추상화한다.
class Person implements Serializable {
	/**
	 * 버전관리를 위한 필수 상수. 
	 */
	private static final long serialVersionUID = 6412276319311846923L;
	String name;
	// 이 정보는 직렬화 하지 않겠다는 예약어 transient
 	transient String job;

	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return this.name + ", " + this.job;
	}
}


public class SerializationTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person personSoi = new Person("박소이", "프로듀서");
		Person personAnzu = new Person("안즈", "아이돌");
		
		// 직렬화. 인스턴스의 현 상태를 파일의 형태로 저장한다.
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			// 파일로 저장해버리기
			oos.writeObject(personSoi);
			oos.writeObject(personAnzu);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("직렬화 완료. 파일을 확인하세요.");
		
		// 역직렬화. 파일로 만들어진 인스턴스를 다시 클래스에 불러온다.
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Person p1 = (Person)ois.readObject();
			Person p2 = (Person)ois.readObject();
		
			System.out.println(p1);
			System.out.println(p2);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
