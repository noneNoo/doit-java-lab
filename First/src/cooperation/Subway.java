package cooperation;

public class Subway {
	int lineNum;
	int passengerCount;
	int money;
	

	// 지하철 노선 번호를 매개변수로 받는 생성자
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}

	// 승객이 지하철에 탄 경우를 구현한 메서드
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	// 지하철 정보를 출력하는 메서드
	public void showInfo() {
		System.out.println(lineNum +"호선의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
