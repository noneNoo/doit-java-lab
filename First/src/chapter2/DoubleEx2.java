package chapter2;

public class DoubleEx2 {
	// �ε� �Ҽ��� ����� ����
	// �ε� �Ҽ��� ���� �����ϸ� �ణ�� ������ �߻��Ѵ�.
	// ������ �ణ�� ������ �����ϴ��� �� ������ ������ �Ǽ� ���� ǥ���ϱ� ���� �ε� �Ҽ��� ����� ����Ѵ�.
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
			System.out.println(dnum);
		}
		// 1001�� �ƴ϶� ���������� ��µȴ�.
		System.out.println(dnum);
	}
}