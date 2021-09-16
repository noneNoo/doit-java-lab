package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// 클래스의 static getter 메서드를 호출하여 참조변수 2개에 각각 대입
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// 두 참조변수가 같은 주소를 가리키는지 확인한다. 
		System.out.println(myCompany1);
		System.out.println(myCompany2);

		// true 출력
		System.out.println(myCompany1 == myCompany2);
	}

}
