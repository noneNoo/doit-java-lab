package cooperation;

public class Student {
	public String studentName;
	public int grade;
	public int money;
	
	// �л� �̸��� ���� ���� �Ű������� �޴� ������
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	// �л��� ������ Ÿ�� 1000���� �����ϴ� �޼���
	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= 1000;
	}
	
//	 �л��� ����ö�� Ÿ�� 1500���� �����ϴ� �޼���
	public void takeSubway(Subway subway) {
		subway.take(1500);
		this.money -= 1500;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(10000);
		this.money -= 10000;
		
		
	}
	
	//�л��� ���� ������ ����ϴ� �޼���
	public void showInfo() {
		if(money == 0) {
			System.out.println(studentName +"���� ���� ���� �����ϴ�... ȭ����!");
		} else {
		System.out.println(studentName +"���� ���� ���� " + money +"�� �Դϴ�.");
		}
	}
}