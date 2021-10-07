package inheritance;

// Customer Ŭ������ ��ӹ޾� �� �Ӽ����� �޾ƿ´�
public class VIPCustomer extends Customer {
	// Ư���� ��ȭ�� �ʿ��� �κе��� ���� ����
	private int agentID;	// VIP ���� ����
	double saleRatio;		// VIP ���� ������

	// VIP ���� ����
	public VIPCustomer(int customerID, String customerName, int agentID) {

		super(customerID, customerName);
		
		// protected ������ ��ӹ��� Ŭ�������� ������ ���� �����ϰ� ������ �ο���
		customerGrade = "VIP"; 
		this.agentID = agentID;
		
		// �Ʒ��� ������ ���� Ŭ�������� public���� �����߱� ������ ���� ���� ������ �ȴ�.
		bonusRatio = 0.05;	// 5% ����
		saleRatio = 0.1;	// 10% ����

//		System.out.println("VIPCustomer() �����ڰ� ȣ��Ǿ����ϴ�.");
	}
	
	// VIP ���� ������(�޼ҵ� �������̵�) �����忡�� ����
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		price -= (int)(price * saleRatio);	// ���ΰ��� ����ȯ�Ͽ� ���
		return price;
	}
	
	// ���� getter
	public int getAgentId() {
		return agentID;
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + " ��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
}