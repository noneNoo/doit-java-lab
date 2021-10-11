package innerclass;

class Outer {
	int outNum = 100;
	static int sOutNum = 200;
	
	// �ڹ��� �����带 ���� �� ����ϴ� Runnable �������̽�
	Runnable getRunnable(int i) {
		int num = 100;		// ���� ������ ���(final ����)�� ���� �ٲ��
		
		// ���� ���� Ŭ����
		class MyRunnable implements Runnable {
			int localNum = 10;	

			@Override
			public void run() {
//				num += 10;	// ���������� ����� �ٲ�� ������ ���� ������ �� ����
//				i += 10;	// �Ű������� ����� �ٲ�� ������ �����߻�
				System.out.println("i = " + i);
				System.out.println("�������� num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(�ܺ� Ŭ���� �ν��Ͻ� ����)");
				System.out.println("Outer.sOutNum = " + Outer.sOutNum + "(�ܺ� Ŭ���� ���� ����)");
			}
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
