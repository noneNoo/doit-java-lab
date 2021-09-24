package witharraylist;


// Customer Ŭ���� ��۹޾� �� �Ӽ��� �޾ƿ�
public class VIPCustomer extends Customer {
	// �߰� ������� ����
	private int agentID;	// VIP ���� ���� ID
	double saleRatio;		// VIP ���� ������
	
	// VIP �� ������
	public VIPCustomer(int customerID, String customerName, int agentID) {
		// ���� Ŭ������ ����Ű�� ����� super(this�� ������ ����)
		// Customer() �����ڿ� ���̵�� �̸��� �Ѱ��ش�.
		super(customerID, customerName);

		this.agentID = agentID;	// ���� ID ����
		customerGrade = "VIP";	// ��� ���� ����
		bonusRatio = 0.05;		// 5% ����
		saleRatio = 0.1;		// 10% ����
	}
	
	// VIP ���� ������ �޼���
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		// ���ε� ������ �����Ѵ�. (�Ҽ��� ���� ������ �� ���� ������ int����ȯ �ʿ�)
		return (int)(price - price * saleRatio);
	}
	
	public String showCustomerInfo() {
		// super�� �θ��� �޼��� �ҷ��ͼ� �߰��� ����
		return super.showCustomerInfo() + " ��� ���� ��ȣ�� " + agentID + "�Դϴ�.";
	}
	
	public int getAgentId() {
		return agentID;
	}
	}
