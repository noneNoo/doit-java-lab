package chapter9.template;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== 磊悼 林青 ===");
		Car c1 = new AICar();
		c1.run();
		
		System.out.println("=== 荐悼 林青 ===");
		Car c2 = new ManualCar();
		c2.run();
	}

}
