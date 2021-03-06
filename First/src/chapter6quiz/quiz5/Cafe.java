package chapter6quiz.quiz5;

public class Cafe {
	String cafeName;
	String menuName;
	int price;
	
	// 뭔가 노출되면 안 될 것 같음...
	// 잔고와 손님 수
	private int money = 0;
	private int passengerCount = 0;
	
	
	// 카페 생성자 오버로딩
	Cafe(String name) {
		this(name,0);
	}
	
	Cafe(String cafeName, int money) {
		this.cafeName = cafeName;
		this.money = money;
	}
	
	// 판매 메서드
	public void take(Person person, CafeMenu menu) {
		this.take(person, menu, 1);
	}
	public void take(Person person, CafeMenu menu, int num) {
		// 기본 멘트 출력
		System.out.println("안녕하세요! "+ person.getname() + "님. '" + cafeName + "카페' 입니다.");
 		System.out.println(menu.name + "의 " + num + "개 가격은 " + menu.price + "원 입니다.");
 		// 만약 돈이 없을 시
		if(person.getMoney() < menu.price) {
	 		System.out.println("손님의 소지금이 부족합니다. 결제가 실패하였습니다.");
		}else {
			person.setMoney(person.getMoney() - (menu.price * num));
			this.money += menu.price;
			System.out.println(menu.price + "원 결제하였습니다. 남은 잔액 " + person.getMoney());
		}
 		System.out.println("안녕히 가십시오!");
 		System.out.println();
	}
	
	public void showInfo() {
		System.out.println(cafeName + "의 방문객: " + passengerCount + "명, 수입: " + money);
	}
}
