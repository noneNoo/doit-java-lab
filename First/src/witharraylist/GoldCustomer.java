package witharraylist;

public class GoldCustomer extends Customer {
	// Customer class �� ���� ������� ���� ����
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
