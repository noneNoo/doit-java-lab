package witharraylist;

class Animal {
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		
		aTest.moveAnimal(new Human());
		aTest.moveAnimal(new Tiger());
		aTest.moveAnimal(new Eagle());
	}
	

	// 매개변수로 animal형(상위클래스)을 전부 받는다
	public void moveAnimal(Animal animal) {
		// 재정의된 메서드가 호출된다.
		// 가상메서드 원리에 따라 상위 클래스의 move 가 아닌 매개변수의 인스턴스의 move가 재정의되어 호출된다.
		animal.move();
	}
}
