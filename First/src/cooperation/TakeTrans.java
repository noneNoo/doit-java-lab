package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student studentJames = new Student("James", 5000);
		Student StudentTomas = new Student("Tomas", 10000);
		
		// �뼱 ��ȣ�� 100�� ���� ����
		Bus bus100 = new Bus(100);
		
		// �л� ��ü�� �޼���� ������� ��ü�� �Ѱ���
		studentJames.takeBus(bus100);
		bus100.showInfo();
		studentJames.showInfo();
		
		
		// 2ȣ�� ����ö ����!
		Subway subwayGreen = new Subway(2);
		
		// �л� ��ü�� �޼���� ������� ��ü�� �Ѱ���
		StudentTomas.takeSubway(subwayGreen);
		subwayGreen.showInfo();
		StudentTomas.showInfo();
		
		// AloneCodin
		// ��������� �����ؼ� �ý÷� 1���� ��ܼ� ������ ��Ȳ
		
		// �ӻ����� ��������� ����
		Student StudentEdward = new Student("Edward", 10000);
		
		// ��������� �ӻ��ϰ� ���� �ý� ����
		Taxi taxi = new Taxi();
		
		// �ӻ��� �� �߻�
		StudentEdward.takeTaxi(taxi);
		
		// �������� ������� ���� ���
		StudentEdward.showInfo();
		
		// ��÷�� ���� ���
		taxi.showInfo();
	}

}