package inheritance;

public class OverridingTest2 {

	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "Ű��", 2000);
		vc.bonusPoint = 5000;
		
		
		// ������ Ŭ�������� �޼��尡 �ƴ� �ν��Ͻ��� �޼��带 ȣ���Ѵ�. (����޼���)
		System.out.println(vc.getName() + " ���� �����ϼž� �ϴ� �ݾ��� " + vc.calcPrice(10000) + "�� �Դϴ�.");
		
		System.out.println(vc.showCustomerInfo());
	}

}
