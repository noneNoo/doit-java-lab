package singleton;

public class Company {
	// 싱글톤 패턴은 기본 생성자(public)를 사용할 수 없음.

	// 유일하게 생성한 인스턴스
	private static Company instance = new Company();
	

	// private로 생성자를 명시적으로 지정해주어야 한다.
	private Company() {
		
	}
	
	// 생성된 단 하나의 인스턴스(private)를 외부에서 참조할 수 있는 public getter
	// 이 getter는 인스턴스 생성과 상관 없이 호출할 수 있어야 하기 때문에 static으로 선언한다.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// 유일한 인스턴스 반환
	}
}
