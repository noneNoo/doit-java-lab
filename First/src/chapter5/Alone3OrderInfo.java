package chapter5;

public class Alone3OrderInfo {
	public static void main(String[] args) {
		
		OrderInfo order1 = new OrderInfo();
		
		order1.orderNum = 201803120001L;
		order1.orderDate = "2020년 3월 12일";
		order1.orderPersonId = "abc123";
		order1.productId = "PD0345-12";
		order1.orderPersonName = "홍길순";
		order1.orderPersonAdress = "서울시 영등포구 여의도동 20번지";
		
		
		order1.printOrderInfo();
	}

}
