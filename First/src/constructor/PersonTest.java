package constructor;

public class PersonTest {

	public static void main(String[] args) {
		Person personLee = new Person(); // ������ �׽�Ʈ
		
		Person person2 = new Person("�ڼ���" ,183.2f, 43.0f);
		
		System.out.println(person2.height);
	}

}
