package witharraylist;
import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		// silver
		Customer customerNonenoo = new Customer(10010, "���");
		// gold
		Customer customerDaezui = new GoldCustomer(10020, "����");
		Customer customerDanbam = new GoldCustomer(10030, "�ܹ�");
		//vip
		Customer customerAnzu = new VIPCustomer(10040, "��Ÿ�� ����", 12345);
		Customer customerKirari = new VIPCustomer(10050, "��κ��� Ű��", 67890);
		
		
		customerList.add(customerNonenoo);
		customerList.add(customerDaezui);
		customerList.add(customerDanbam);
		customerList.add(customerAnzu);
		customerList.add(customerKirari);
		
		// �� ���� ���
		for (Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for (Customer customer : customerList) {
			int pay = customer.calcPrice(price);
			System.out.println(customer.getName() + "���� " + pay + "�� �����ϼ̽��ϴ�.");
			System.out.println(customer.getName() + "���� ���� ���� ����Ʈ�� " + customer.bonusPoint + "�� �Դϴ�.");
		}
		
	}

}
