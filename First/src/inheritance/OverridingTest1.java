package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerSoi = new Customer(10010, "소이");
		customerSoi.bonusPoint = 904;
		
		VIPCustomer customerAnzu = new VIPCustomer(10020, "후타바 안즈", 12345);
		customerAnzu.bonusPoint = 92100;
		
		int price = 10000;
		System.out.println(customerSoi.getName() + " 님이 지불해야 하는 금액은 " + customerSoi.calcPrice(price) + "원 입니다.");
		System.out.println(customerAnzu.getName() + " 님이 지불해야 하는 금액은 " + customerAnzu.calcPrice(price) + "원 입니다.");
		
		System.out.println(customerSoi.showCustomerInfo());
		System.out.println(customerAnzu.showCustomerInfo());
	}

}
