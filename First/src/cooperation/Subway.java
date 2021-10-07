package cooperation;

public class Subway {
	int lineNum;
	int passengerCount;
	int money;
	

	// ����ö �뼱 ��ȣ�� �Ű������� �޴� ������
	public Subway(int lineNum) {
		this.lineNum = lineNum;
	}

	// �°��� ����ö�� ź ��츦 ������ �޼���
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}

	// ����ö ������ ����ϴ� �޼���
	public void showInfo() {
		System.out.println(lineNum +"ȣ���� �°��� " + passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
	}
}