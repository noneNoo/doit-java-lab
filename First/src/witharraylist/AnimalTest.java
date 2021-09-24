package witharraylist;

class Animal {
	public void move() {
		System.out.println("�������� �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	

	// �Ű������� animal��(����Ŭ����)�� ���� �޴´�
	public void moveAnimal(Animal animal) {
		// �����ǵ� �޼��尡 ȣ��ȴ�.
		// ����޼��� ������ ���� ���� Ŭ������ move �� �ƴ� �Ű������� �ν��Ͻ��� move�� �����ǵǾ� ȣ��ȴ�.
		animal.move();
	}
}
