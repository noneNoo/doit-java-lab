package singleton;

public class CarFactory {
	// 1. �����ڸ� private�� ����. �ܺο��� ������ ���´�.
	private CarFactory() {}
	
	// 2. ������ �ν��Ͻ� ����. �ܺο��� �������� ���ϵ��� private�� ����
	private static CarFactory instance = new CarFactory();
	
	// �ܺο��� ������ �� �ִ� public �޼��� ����
	// static���� �����Ͽ� �ν��Ͻ� ������ ������� ȣ���� �� �־�� �Ѵ�
	public static CarFactory getInstance() {
		// ���� �ν��Ͻ��� ����ִٸ� �ν��Ͻ� ���ϳ��� �Ҵ�.
		if(instance == null) {
			instance = new CarFactory();
		}
		return instance;
	}
	
	// ���� �����ϴ� �޼���
	public Car createCar() {
		Car newCar = new Car();
		return newCar;
	}
}
