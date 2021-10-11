package innerclass;


class Outer2 {
	// Runnable Ÿ���� ��ȯ�ϴ� �޼���
	Runnable getRunnable(int i) {
		int num = 100;
		
		// �͸� ���� Ŭ����
		// �̸��� ���� Ŭ������ ���� => �ٷ� ��ȯ�ع�����.
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				System.out.println("Runnable�� ������ �͸� Ŭ������ ����");
			}		
		};		// �͸�Ŭ������ ���� ; �� ��
	}
	
	// �͸� ���� Ŭ������ ������ ������ ���� �ִ�.
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
		
	};
	
}
public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runnerble = out.getRunnable(10);
		
		// �͸� ���� Ŭ���� ����
		runnerble.run();
		
		// �͸� ���� Ŭ������ ������
		out.runner.run();
	}

}
