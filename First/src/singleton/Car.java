package singleton;

public class Car {
	// 클래스에서 공통으로 사용하는 static 변수
	private static int serialNum = 10000;
	private int carNum;
	
	// 생성자
	public Car() {
		// 객체 생성과 동시에 class의 static변수(고유번호) 증가
		// 그 후 static 변수 값을 멤버변수에 대입하여 인스턴스 생성
		serialNum ++;
		carNum = serialNum;
	}
	
	// CarNum getter
	public int getCarNum() {
		return carNum;
	}
	
}
