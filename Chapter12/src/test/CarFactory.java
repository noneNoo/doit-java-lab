package test;

import java.util.HashMap;

// HashMap을 써서 구현
public class CarFactory {

	// Static으로 바로 호출 가능한 인스턴스 생성! 아하!
	private static CarFactory instance = new CarFactory();
	HashMap<String,Car> hashMap = new HashMap<String, Car>();
	
	// 생성자
	public CarFactory() {};
	
	public static CarFactory getInstance() {
		if(instance == null) {
			instance = new CarFactory();
		}
		
		return instance;
	};

	// 차 만들기 기능
	public Car createCar(String name) {
		// 이미 집합에 name이란 키값이 있으면
		if(hashMap.containsKey(name)) {
			// 만들기 생략하고 그냥 자신의 값 리턴
			return hashMap.get(name);
		}
		Car car = new Car(name);
		hashMap.put(name, car);
		return car;
	}


}
