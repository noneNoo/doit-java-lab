package chapter9.step1;

public class AutoCar extends Car {

	@Override
	public void run() {
		System.out.println("���� �޸��ϴ�.");
	}

	@Override
	public void reful() {
		System.out.println("õ�� ������ �����մϴ�.");
	}
	
	public void load() {
		System.out.println("���� �ƽ��ϴ�.");
	}
}
