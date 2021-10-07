package polymorphism;

public class CustomerTest {

	public static void main(String[] args) {
		
		// �ǹ�ȸ�� ���� ����
		Customer customerNonenoo = new Customer();
		customerNonenoo.setName("����");
		customerNonenoo.setId(10010);
		customerNonenoo.bonusPoint = 1000;
		System.out.println(customerNonenoo.showCustomerInfo());
		
		// VIPȸ�� ���� ����
		// ������ Customer�� ������ �ν��Ͻ��� VIP�� Ŭ������ ���������.
		
		Customer customerAnzu = new VIPCustomer(10020, "��Ÿ�� ����", 12345);
		customerAnzu.bonusPoint = 1000;
		System.out.println(customerAnzu.showCustomerInfo());
		
		 System.out.println("===== �������� ���ʽ� ����Ʈ ��� Test =====");
		 
		 // ��ǰ ����
		 int price = 10000;
		 int noneNooPrice = customerNonenoo.calcPrice(price);
		 int anzuPrice = customerAnzu.calcPrice(price);
		 
		 System.out.println(customerNonenoo.getName() +" ���� " + noneNooPrice + "�� �����Ͽ����ϴ�.");
		 System.out.println(customerNonenoo.showCustomerInfo());
		 System.out.println(customerAnzu.getName() + " ���� " + anzuPrice + "�� �����Ͽ����ϴ�.");
		 System.out.println(customerAnzu.showCustomerInfo());
	}

}