package chapter7quiz;

import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog("�Ĺ�", "��Ƽ��"));
		dogs.add(new Dog("����", "��"));
		dogs.add(new Dog("����", "�ٺ�"));
		dogs.add(new Dog("�ظ�", "��Ű"));
		
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
