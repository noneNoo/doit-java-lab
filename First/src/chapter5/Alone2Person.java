package chapter5;

public class Alone2Person {

		int age;
		String name;
		boolean isMarried;
		int children;
		
		// 정보를 출력하는 메서드 생성
		public void Introduce() {
			System.out.println(age);
			System.out.println(name);
			System.out.println(isMarried);
			System.out.println(children);
		}
	
		// 클래스 내부에 메인 함수 넣기
	public static void main(String[] args) {
		Alone2Person personJ = new Alone2Person();
		
		personJ.age = 40;
		personJ.name = "James";
		personJ.isMarried = true;
		personJ.children = 3;
		
		// 해당 객체의 메서드 호출
		personJ.Introduce();
	}

}
