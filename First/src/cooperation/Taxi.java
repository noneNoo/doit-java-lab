package cooperation;

public class Taxi {
	int passengerCount;
	int money;
	

	// �°��� ����ö�� ź ��츦 ������ �޼���
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println("������ " + money + "�Դϴ�.");
	}
}
