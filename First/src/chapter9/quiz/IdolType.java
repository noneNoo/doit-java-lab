package chapter9.quiz;

public abstract class IdolType {
	
	public void rest() {
		System.out.println("������ ���� �Ǿ� ���̵��� �޽��մϴ�.");
		System.out.println();
	}
	
	public abstract void training(int count);
	public abstract boolean audition(int count);
	public boolean go(int count) {
		
		System.out.println("�� " + count + " ȸ Ʈ���̴��Ͽ� WING ����ǿ� �����غ��ô�!");
		System.out.println();
		for(int i = 0; i < count; i++) {
			training(i);
		}
		rest();
		return audition(count);
		
	}

	
}