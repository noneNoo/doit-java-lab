package chapter9.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// 템플릿 메서드
	final public void run() {
		startCar();
		
		// 추상메서드 (클래스에 따라 다른 구현이 불려옴)
		drive();
		wiper();
		stop();
		
		turnOff();
	}
}
