package cooperation;

public class Bus {
	int busNum;
	int passengerCount;
	int money;

// ���� ��ȣ�� �Ű������� �޴� ������
public Bus(int busNum) {
	this.busNum = busNum;
}

// �°��� ������ ź ��츦 ������ �޼���
public void take(int money) {
	this.money += money;
	passengerCount++;
}

// ���� ������ ����ϴ� �޼���
public void showInfo() {
	System.out.println("���� " + busNum + "���� �°��� " + 
passengerCount + "���̰�, ������ " + money + "�� �Դϴ�.");
}

}