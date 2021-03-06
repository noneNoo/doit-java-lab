package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// 싱글톤 패턴으로 공장 단 하나 생성.
		CarFactory factory = CarFactory.getInstance();
		
		// 차 생성 test
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();

		System.out.println(mySonata.getCarNum());	// 10001
		System.out.println(yourSonata.getCarNum());	// 10002
	}

}
