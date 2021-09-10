package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person(); // 생성자 테스트
		
		Person person2 = new Person("박소이" ,183.2f, 43.0f);
		
		System.out.println(person2.height);
	}

}
