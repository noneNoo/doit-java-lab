package chapter9.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== �ڵ� ���� ===");
		Car c1 = new AICar();
		c1.run();
		
		System.out.println("=== ���� ���� ===");
		Car c2 = new ManualCar();
		c2.run();
	}

}
