package inheritance;

public class Customer {
	// ���� ���� �������
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	
	// ���ʽ� ���� �������
	int bonusPoint;
	double bonusRatio;
	
	// �⺻ ������
//	public Customer() {
//		
//		// ����Ʈ ���, ���������� �⺻ ����
//		customerGrade = "SILVER";
//		bonusRatio = 0.01; 
//		System.out.println("Customer() �����ڰ� ȣ��Ǿ����ϴ�.");
//	}
	
	// ������ �������̵� (���̵�, �̸� �Ű������� ����)
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
//		System.out.println("Customer() �����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	// getter
	public int getId() {
		return customerID;
	}
	
	public String getName() {
		return customerName;
	}
	
	public String getGrade() {
		return customerGrade;
	}
	
	// setter
	public void setId(int customerID) {
		this.customerID = customerID;
	}
	
	public void setName(String customerName) {
		this.customerName = customerName;
	}
	
	public void setGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	
	// ��ǰ ������ �޾ƿ� ������ ����Ʈ�� ����Ѵ�.
	public int calcPrice(int price) {
		// ���ʽ� ����Ʈ = ���� ���ʽ� ����Ʈ + (��ǰ ���� * ���ʽ� ����);
		bonusPoint += price * bonusRatio;
		// �Ϲ� ������ ���ΰ��� �Ǹ� ��������! �׳� ���� ����
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
	}
}