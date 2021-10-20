package stream.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// �� Ŭ������ ����ȭ �ϰڴٴ� �ǵ��� ǥ���ϴ� Ŭ������ �߻�ȭ�Ѵ�.
class Person implements Serializable {
	/**
	 * ���������� ���� �ʼ� ���. 
	 */
	private static final long serialVersionUID = 6412276319311846923L;
	String name;
	// �� ������ ����ȭ ���� �ʰڴٴ� ����� transient
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
		Person personSoi = new Person("�ڼ���", "���ε༭");
		Person personAnzu = new Person("����", "���̵�");
		
		// ����ȭ. �ν��Ͻ��� �� ���¸� ������ ���·� �����Ѵ�.
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			// ���Ϸ� �����ع�����
			oos.writeObject(personSoi);
			oos.writeObject(personAnzu);
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("����ȭ �Ϸ�. ������ Ȯ���ϼ���.");
		
		// ������ȭ. ���Ϸ� ������� �ν��Ͻ��� �ٽ� Ŭ������ �ҷ��´�.
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
