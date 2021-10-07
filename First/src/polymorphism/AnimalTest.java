package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("�������� �����Դϴ�.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �Ƚ��ϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
	
	public void flying() {
		System.out.println("�������� ������ �� ��ϴ�.");
	}
}

public class AnimalTest {
	// �ڷ����� Animal���� ArrayList����
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();

		// �ڵ� ��ĳ����
		aTest.addAnimal();
		System.out.println("=== ���� ������ �ٿ� ĳ���� ===");
		aTest.testCasting();
		
	}
	
	// �ڵ� ArrayList�� Animal������ �����ϸ� ������ ��ĳ����
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (Animal animal : aniList) {
			animal.move();
		}
	}
	
	public void testCasting() {
		// ��� �迭�� �ϳ��� ���鼭
		for(int i = 0; i < aniList.size(); i++) {
			// Animal������ �����´�
			Animal ani = aniList.get(i);

			// ani�� �ν��Ͻ��� Human���̸�
			if(ani instanceof Human) {
				System.out.println("����� ��Ÿ����!");
				// ������ ����ȯ (�ٿ�ĳ����)
				Human h = (Human)ani;
				h.readBook();
				
				//ani�� �ν��Ͻ��� Tiger���̶��
			} else if (ani instanceof Tiger) {
				System.out.println("ȣ���̰� ��Ÿ����!");
				Tiger t = (Tiger)ani;
				t.hunting();
				
				//ani�� �ν��Ͻ��� Eagle���̶��
			} else if (ani instanceof Eagle) {
				System.out.println("�������� ��Ÿ����!");
				Eagle e = (Eagle)ani;
				e.flying();
				
				// �� �� ���� Ŭ�������� �ν��Ͻ��� ���
			} else {
				System.out.println("�������� �ʴ� ���Դϴ�.");
			}
		}
	}
	

	// �Ű������� animal��(����Ŭ����)�� ���� �޴´�
	public void moveAnimal(Animal animal) {
		// �����ǵ� �޼��尡 ȣ��ȴ�.
		// ����޼��� ������ ���� ���� Ŭ������ move �� �ƴ� �Ű������� �ν��Ͻ��� move�� �����ǵǾ� ȣ��ȴ�.
		animal.move();
	}
}