package witharraylist;

public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	// �⺻ ������
	public Customer() {
		// �ڵ����� �� ��ް� ���ʽ� ǤƮ �������� �����ϴ� �Լ� ȣ��
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}

	// ��� : �ǹ�, ������: 0.01 (1%)
	// �����ڿ����� ȣ��Ǵ� �޼����̹Ƿ� private�� �����Ѵ�
	private void initCustomer() {
		customerGrade = "SILVER";
		bonusRatio = 0.01;
	}

	// ��ǰ ������ �Ű������� �޾ƿ� ������ ����Ʈ�� ����Ͽ� �����ϴ� �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		// �Ϲ� ���� ����
		return price;
	}
	
	// �� ���� ȣ�� �޼���
	public String showCustomerInfo() {
		return customerName + "���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� " + bonusPoint + "�Դϴ�.";
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
	
	
	
}