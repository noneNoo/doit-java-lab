package constructor;

// Person 객체를 생성하는 생성자 만들기
public class Person {
	String name;
	float height;
	float weight;
	
	public Person() {}; // 디폴트 생성자. 아무런 인자 없이도 생성자 호출이 가능하게끔 한다.
	
	// 생성자 오버로딩
	// 매개변수로 이름을 입력받을 시 멤버변수 name의 값을 지정하고 인스턴스를 초기화한다.
	public Person(String pName) {
		name = pName;
	}
	
	// 매개변수로 참조변수 값을 모조리 받기
	public Person(String pName, float pHeight, float pWeight) {
		name = pName;
		height = pHeight;
		weight = pWeight;
	}
}
