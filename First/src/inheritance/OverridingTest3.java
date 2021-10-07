package inheritance;

public class OverridingTest3 {

	public static void main(String[] args) {
		int price = 10000;
		
		// ===== Customer Ŭ���� =====
		
		// �Ϲ� ȸ�� �̼��� ����
		Customer customerLee = new Customer(10010, "�̼���");
		
		// �Ϲ� ȸ�� Ŭ������ calPrice() �޼��� ���
		// �����ǵ� �޼��� ����
		System.out.println(customerLee.getName() + " ���� �����ؾ� �� �ݾ��� " + customerLee.calcPrice(price) +"�� �Դϴ�.");
		
		// ===== VIPCustomer Ŭ���� =====
		
		// VIP ȸ�� ������ ����
		// calPrice() �޼��� �����ǵ�.
		// getAgentID() �޼��� �߰���.
		// getName() �޼��� �����ǵ��� ����.
		VIPCustomer customerKim = new VIPCustomer(10020, "������", 12345);
		
		// VIP ȸ�� Ŭ������ �����ǵ� calPrice() �޼��带 ���
		System.out.println(customerKim.getName() + " ���� �����ؾ� �� �ݾ��� " + customerKim.calcPrice(price) + "�� �Դϴ�.");

		// ===== VIPCustomer Ŭ������ ���� Ŭ����(Customer) �� ��ĳ���� =====
		
		// VIP ȸ�� �ڼ��� ����
		// calPrice() �޼��� �����ǵ�.
		// getAgentID() �޼��� �߰���.
		// getName() �޼��� �����ǵ��� ����.
		Customer vipUpCasting = new VIPCustomer(10030, "�ڼ���", 2000);
		
		// VIP ȸ�� Ŭ������ �����ǵ� calPrice() �޼��带 ���
		
		System.out.println(vipUpCasting.getName()+ " ���� �����ؾ� �� �ݾ��� " + vipUpCasting.calcPrice(price) + "�� �Դϴ�.");
	}

}