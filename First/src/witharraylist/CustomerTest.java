package witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		// silver
		Customer customerNonenoo = new Customer(10010, "논노");
		// gold
		Customer customerDaezui = new GoldCustomer(10020, "대쥐");
		Customer customerDanbam = new GoldCustomer(10030, "단밤");
		//vip
		Customer customerAnzu = new VIPCustomer(10040, "후타바 안즈", 12345);
		Customer customerKirari = new VIPCustomer(10050, "모로보시 키라리", 67890);
		
		
		customerList.add(customerNonenoo);
		customerList.add(customerDaezui);
		customerList.add(customerDanbam);
		customerList.add(customerAnzu);
		customerList.add(customerKirari);
		
		// 고객 정보 출력
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for (Customer customer : customerList) {
			int pay = customer.calcPrice(price);
			System.out.println(customer.getName() + "님이 " + pay + "원 지불하셨습니다.");
			System.out.println(customer.getName() + "님의 현재 보넛 포인트는 " + customer.bonusPoint + "원 입니다.");
		}
		
	}

}
