package cooperation;

public class Taxi {
	int passengerCount;
	int money;
	

	// 승객이 지하철에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("수입은 " + money + "입니다.");
	}
}
