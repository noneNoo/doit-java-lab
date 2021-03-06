package chapter6quiz.quiz5;

public class CafeTest {

	public static void main(String[] args) {
		// 사람 인스턴스 만들기
		Person personAnzu = new Person("후타바 안즈", 5000);
		Person personKirari = new Person("모로보시 키라리"); // 소지금 0
		
		// 카페 인스턴스 만들기
		Cafe ankiraCafe = new Cafe("안키라");
		Cafe ankimoCafe = new Cafe("안키모");
		
		// 카페 메뉴 인스턴스 만들기
		CafeMenu ame = new CafeMenu("사탕", 1500);
		CafeMenu potatochip = new CafeMenu("감자칩", 1500);
		CafeMenu americano = new CafeMenu("아메리카노", 4000);
		CafeMenu latte = new CafeMenu("카페라떼", 4500);
		
		ankiraCafe.take(personAnzu, ame);
		ankimoCafe.take(personKirari, americano);
		
		personKirari.setMoney(10000);

		ankimoCafe.take(personKirari, americano);
		
		personAnzu.showInfo();
		personKirari.showInfo();
	}

}
