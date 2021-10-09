package test;

import java.util.HashMap;

// HashMap�� �Ἥ ����
public class CarFactory {

	// Static���� �ٷ� ȣ�� ������ �ν��Ͻ� ����! ����!
	private static CarFactory instance = new CarFactory();
	HashMap<String,Car> hashMap = new HashMap<String, Car>();
	
	// ������
	public CarFactory() {};
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	};

	// �� ����� ���
	public Car createCar(String name) {
		// �̹� ���տ� name�̶� Ű���� ������
		if(hashMap.containsKey(name)) {
			// ����� �����ϰ� �׳� �ڽ��� �� ����
			return hashMap.get(name);
		}
		Car car = new Car(name);
		hashMap.put(name, car);
		return car;
	}


}
