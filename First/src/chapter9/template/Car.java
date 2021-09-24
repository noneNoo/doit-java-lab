package chapter9.template;

public abstract class Car {
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	
	public void startCar() {
		System.out.println("�õ��� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("�õ��� ���ϴ�.");
	}
	
	// ���ø� �޼���
	final public void run() {
		startCar();
		
		// �߻�޼��� (Ŭ������ ���� �ٸ� ������ �ҷ���)
		drive();
		wiper();
		stop();
		
		turnOff();
	}
}
