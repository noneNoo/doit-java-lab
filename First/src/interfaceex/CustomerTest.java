package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer 클래스형인 customer를 Buy 인터페이스형인 buyer에 대입하여 형변환
		// buyer은 Buy 인터페이스의 메서드만 호출 가능.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();

		if(seller instanceof Customer) {
			// 하위 customer형으로 다시 형변환
			Customer customer2 = (Customer)seller;
			// 
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}
}
