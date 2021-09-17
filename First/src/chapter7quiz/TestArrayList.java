package chapter7quiz;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("냐무", "말티즈"));
		dogs.add(new Dog("안즈", "뵤"));
		dogs.add(new Dog("소이", "바보"));
		dogs.add(new Dog("멈머", "쿠키"));
		
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
