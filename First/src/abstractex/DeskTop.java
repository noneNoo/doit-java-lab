package abstractex;

public class DeskTop extends Computer {

	// ��ӹ��� �߻�޼����� ������ �ǹ��� �״�� �Ѿ���� ������
	// 1. ���⼭ �߻�޼��带 �����Ѵ�
	// 2. �ش� Ŭ������ �߻�Ŭ������ ��ȯ�Ѵ� (�ٽ� ����Ŭ������ ������ �̷�)
	
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
	
}
