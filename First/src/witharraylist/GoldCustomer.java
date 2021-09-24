package witharraylist;

public class GoldCustomer extends Customer {
	// Customer class 에 없는 멤버변수 새로 선언
	double saleRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		saleRatio = 0.1;
		bonusRatio = 0.02;
		customerGrade = "GOLD";
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
