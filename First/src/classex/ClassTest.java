package classex;

public class ClassTest {
	// forName()�޼��忡�� �߻��ϴ� ������ ����ó�� �ϱ� ���ؼ�. throws ���� (�̸��� ��ġ�ϴ� Ŭ������ ���� ���)
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass2.getName());
		
	}

}
