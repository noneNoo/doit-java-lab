package singleton;

public class CarFactory {
	// 1. 생성자를 private로 지정. 외부에서 생성을 막는다.
	private CarFactory() {}
	
	// 2. 유일한 인스턴스 생성. 외부에서 접근하지 못하도록 private로 생성
	private static CarFactory instance = new CarFactory();
	
	// 외부에서 참조할 수 있는 public 메서드 생성
	// static으로 선언하여 인스턴스 생성과 상관없이 호출할 수 있어야 한다
	public static CarFactory getInstance() {
		// 만약 인스턴스가 비어있다면 인스턴스 단하나를 할당.
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// 차를 생성하는 메서드
	public Car createCar() {
		Car newCar = new Car();
		return newCar;
	}
}
