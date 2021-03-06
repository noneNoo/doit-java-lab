package polymorphism;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물들이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 걷습니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 날개를 쭉 폅니다.");
	}
}

public class AnimalTest {
	// 자료형이 Animal형인 ArrayList생성
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();

		// 자동 업캐스팅
		aTest.addAnimal();
		System.out.println("=== 원래 형으로 다운 캐스팅 ===");
		aTest.testCasting();
		
	}
	
	// 자동 ArrayList에 Animal형으로 저장하며 묵시적 업캐스팅
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for (Animal animal : aniList) {
			animal.move();
		}
	}
	
	public void testCasting() {
		// 모든 배열을 하나씩 돌면서
		for(int i = 0; i < aniList.size(); i++) {
			// Animal형으로 가져온다
			Animal ani = aniList.get(i);

			// ani의 인스턴스가 Human형이면
			if(ani instanceof Human) {
				System.out.println("사람이 나타났다!");
				// 명시적 형변환 (다운캐스팅)
				Human h = (Human)ani;
				h.readBook();
				
				//ani의 인스턴스가 Tiger형이라면
			} else if (ani instanceof Tiger) {
				System.out.println("호랑이가 나타났다!");
				Tiger t = (Tiger)ani;
				t.hunting();
				
				//ani의 인스턴스가 Eagle형이라면
			} else if (ani instanceof Eagle) {
				System.out.println("독수리가 나타났다!");
				Eagle e = (Eagle)ani;
				e.flying();
				
				// 알 수 없는 클래스형의 인스턴스일 경우
			} else {
				System.out.println("지원되지 않는 형입니다.");
			}
		}
	}
	

	// 매개변수로 animal형(상위클래스)을 전부 받는다
	public void moveAnimal(Animal animal) {
		// 재정의된 메서드가 호출된다.
		// 가상메서드 원리에 따라 상위 클래스의 move 가 아닌 매개변수의 인스턴스의 move가 재정의되어 호출된다.
		animal.move();
	}
}
