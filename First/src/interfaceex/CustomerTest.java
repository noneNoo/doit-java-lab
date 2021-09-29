package interfaceex;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		// Customer Ŭ�������� customer�� Buy �������̽����� buyer�� �����Ͽ� ����ȯ
		// buyer�� Buy �������̽��� �޼��常 ȣ�� ����.
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		
		Sell seller = customer;
		seller.sell();
		seller.order();

		if(seller instanceof Customer) {
			// ���� customer������ �ٽ� ����ȯ
			Customer customer2 = (Customer)seller;
			// 
			customer2.buy();
			customer2.sell();
		}
		customer.order();
	}
}
