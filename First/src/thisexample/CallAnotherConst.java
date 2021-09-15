package thisexample;

class Person {
	String name;
	int age;
	
	Person() {
		this("이름없음", 1);
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 클래스형을 반환하는 메서드
	Person returnISelf() {
		return this;
	}
}

public class CallAnotherConst {
	public static void main(String[] args) {
		Person noName = new Person();

		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnISelf();
		System.out.println(p);
		System.out.print(noName);
	
	}

}
