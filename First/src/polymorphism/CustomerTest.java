package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		// 실버회원 논노 생성
		Customer customerNonenoo = new Customer();
		customerNonenoo.setName("논노");
		customerNonenoo.setId(10010);
		customerNonenoo.bonusPoint = 1000;
		System.out.println(customerNonenoo.showCustomerInfo());
		
		// VIP회원 안즈 생성
		// 선언은 Customer로 하지만 인스턴스는 VIP형 클래스로 만들어진다.
		
		Customer customerAnzu = new VIPCustomer(10020, "후타바 안즈", 12345);
		customerAnzu.bonusPoint = 1000;
		System.out.println(customerAnzu.showCustomerInfo());
		
		 System.out.println("===== 할인율과 보너스 포인트 계산 Test =====");
		 
		 // 상품 가격
		 int price = 10000;
		 int noneNooPrice = customerNonenoo.calcPrice(price);
		 int anzuPrice = customerAnzu.calcPrice(price);
		 
		 System.out.println(customerNonenoo.getName() +" 님이 " + noneNooPrice + "원 지불하였습니다.");
		 System.out.println(customerNonenoo.showCustomerInfo());
		 System.out.println(customerAnzu.getName() + " 님이 " + anzuPrice + "원 지불하였습니다.");
		 System.out.println(customerAnzu.showCustomerInfo());
	}

}
