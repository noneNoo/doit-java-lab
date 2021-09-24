package chapter9.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 자동 주행 ===");
		Car c1 = new AICar();
		c1.run();
		
		System.out.println("=== 수동 주행 ===");
		Car c2 = new ManualCar();
		c2.run();
	}

}
