package chapter5;

public class OrderInfo {

	long orderNum;
	String productId;
	String orderPersonId;
	String orderPersonName;
	String orderPersonAdress;
	String orderDate;
	
	public void printOrderInfo() {
		System.out.println("�ֹ� ��ȣ: " + orderNum);
		System.out.println("�ֹ��� ���̵�: " + orderPersonId);
		System.out.println("�ֹ� ��¥: " + orderDate);
		System.out.println("�ֹ��� �̸�: " + orderPersonName);
		System.out.println("�ֹ� ��ǰ ��ȣ: " + productId);
		System.out.println("��� �ּ�: " + orderPersonAdress);
		
	}
}
