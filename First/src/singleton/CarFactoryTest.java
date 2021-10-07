package singleton;

public class CarFactoryTest {

	public static void main(String[] args) {
		// �̱��� �������� ���� �� �ϳ� ����.
		CarFactory factory = CarFactory.getInstance();
		
		// �� ���� test
		Car mySonata = factory.createCar();
		Car yourSonata = factory.createCar();

		System.out.println(mySonata.getCarNum());	// 10001
		System.out.println(yourSonata.getCarNum());	// 10002
	}

}