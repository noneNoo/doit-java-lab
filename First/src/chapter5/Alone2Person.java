package chapter5;

public class Alone2Person {

		int age;
		String name;
		boolean isMarried;
		int children;
		
		// ������ ����ϴ� �޼��� ����
		public void Introduce() {
			System.out.println(age);
			System.out.println(name);
			System.out.println(isMarried);
			System.out.println(children);
		}
	
		// Ŭ���� ���ο� ���� �Լ� �ֱ�
	public static void main(String[] args) {
		Alone2Person personJ = new Alone2Person();
		
		personJ.age = 40;
		personJ.name = "James";
		personJ.isMarried = true;
		personJ.children = 3;
		
		// �ش� ��ü�� �޼��� ȣ��
		personJ.Introduce();
	}

}