package inheritance;

public class CustomerTest1 {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		
//		customerLee.setName("�̼���");
//		customerLee.setId(10010);
//		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(0, null, 0);
		customerKim.setName("������");
		customerKim.setId(10020);
		customerKim.bonusPoint = 10000;
		
//		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKim.showCustomerInfo());
		System.out.println(customerKim.showVIPInfo());
	}

}
