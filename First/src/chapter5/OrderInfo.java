package chapter5;

public class OrderInfo {

	long orderNum;
	String productId;
	String orderPersonId;
	String orderPersonName;
	String orderPersonAdress;
	String orderDate;
	
	public void printOrderInfo() {
		System.out.println("주문 번호: " + orderNum);
		System.out.println("주문자 아이디: " + orderPersonId);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문자 이름: " + orderPersonName);
		System.out.println("주문 상품 번호: " + productId);
		System.out.println("배송 주소: " + orderPersonAdress);
		
	}
}
