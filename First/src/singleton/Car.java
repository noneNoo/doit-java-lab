package singleton;

public class Car {
	// Ŭ�������� �������� ����ϴ� static ����
	private static int serialNum = 10000;
	private int carNum;
	
	// ������
	public Car() {
		// ��ü ������ ���ÿ� class�� static����(������ȣ) ����
		// �� �� static ���� ���� ��������� �����Ͽ� �ν��Ͻ� ����
		serialNum ++;
		carNum = serialNum;
	}
	
	// CarNum getter
	public int getCarNum() {
		return carNum;
	}
	
}
