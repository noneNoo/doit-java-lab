package chapter5;

public class Alone3OrderInfo {
	public static void main(String[] args) {
		
		OrderInfo order1 = new OrderInfo();
		
		order1.orderNum = 201803120001L;
		order1.orderDate = "2020�� 3�� 12��";
		order1.orderPersonId = "abc123";
		order1.productId = "PD0345-12";
		order1.orderPersonName = "ȫ���";
		order1.orderPersonAdress = "����� �������� ���ǵ��� 20����";
		
		
		order1.printOrderInfo();
	}

}