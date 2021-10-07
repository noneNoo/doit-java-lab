package inheritance;

public class OverridingTest1 {

	public static void main(String[] args) {
		Customer customerSoi = new Customer(10010, "����");
		customerSoi.bonusPoint = 904;
		
		VIPCustomer customerAnzu = new VIPCustomer(10020, "��Ÿ�� ����", 12345);
		customerAnzu.bonusPoint = 92100;
		
		int price = 10000;
		System.out.println(customerSoi.getName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerSoi.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(customerAnzu.getName() + " ���� �����ؾ� �ϴ� �ݾ��� " + customerAnzu.calcPrice(price) + "�� �Դϴ�.");
		
		System.out.println(customerSoi.showCustomerInfo());
		System.out.println(customerAnzu.showCustomerInfo());
	}

}