package chapter7quiz;

public class DogTest {

	public static void main(String[] args) {
		Dog[] dogs = new Dog[5];
		
		dogs[0] = new Dog("냐무", "말티즈");
		dogs[1] = new Dog("안즈", "뵤");
		dogs[2] = new Dog("논노", "시츄");
		dogs[3] = new Dog("소이", "바보");
		dogs[4] = new Dog("쿠키", "멍멍이");
		
		for(int i = 0; i < dogs.length; i++) {
			System.out.println(dogs[i].showDogInfo());
		}
		System.out.println("===");
		for(Dog dog:dogs) {
			System.out.println(dog.showDogInfo());
		}
	}

}
