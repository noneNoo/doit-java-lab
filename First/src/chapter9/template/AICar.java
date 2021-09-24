package chapter9.template;

public class AICar extends Car {

	@Override
	public void drive() {
		System.out.println("자율 주행합니다.");
		System.out.println("자동차가 자동으로 방향을 전환합니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율 주행을 종료합니다.");
	}

	@Override
	public void wiper() {
		System.out.println("날씨에 따라 와이퍼가 자동으로 동작합니다.");
	}

}
