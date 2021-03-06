package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		// ===== Customer 클래스 =====
		
		// 일반 회원 이순신 생성
		Customer customerLee = new Customer(10010, "이순신");
		
		// 일반 회원 클래스의 calPrice() 메서드 사용
		// 재정의된 메서드 없음
		System.out.println(customerLee.getName() + " 님이 지불해야 할 금액은 " + customerLee.calcPrice(price) +"원 입니다.");
		
		// ===== VIPCustomer 클래스 =====
		
		// VIP 회원 김유신 생성
		// calPrice() 메서드 재정의됨.
		// getAgentID() 메서드 추가됨.
		// getName() 메서드 재정의되지 않음.
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
		
		// VIP 회원 클래스의 재정의된 calPrice() 메서드를 사용
		System.out.println(customerKim.getName() + " 님이 지불해야 할 금액은 " + customerKim.calcPrice(price) + "원 입니다.");

		// ===== VIPCustomer 클래스를 상위 클래스(Customer) 로 업캐스팅 =====
		
		// VIP 회원 박소이 생성
		// calPrice() 메서드 재정의됨.
		// getAgentID() 메서드 추가됨.
		// getName() 메서드 재정의되지 않음.
		Customer vipUpCasting = new VIPCustomer(10030, "박소이", 2000);
		
		// VIP 회원 클래스의 재정의된 calPrice() 메서드를 사용
		
		System.out.println(vipUpCasting.getName()+ " 님이 지불해야 할 금액은 " + vipUpCasting.calcPrice(price) + "원 입니다.");
	}

}
