package chapter7quiz;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("�Ĺ�", "��Ƽ��");
		dogs[1] = new Dog("����", "��");
		dogs[2] = new Dog("���", "����");
		dogs[3] = new Dog("����", "�ٺ�");
		dogs[4] = new Dog("��Ű", "�۸���");
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		System.out.println("===");
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
