package bookshelf;

public interface Queue {
	
	// �ԷµǴ� ��Ұ��� �迭�� �� �ڿ� �����ϰ�, (enQueue)
	// �� ���� �ִ� ��Ұ��� �����ϰ� �� ���� ��ȯ (deQueue)
	// 
	
	
	void enQueue(String title);	// �迭�� �� �������� �߰�
	String deQueue();			// �� ó�� �׸� ��ȯ
	int getSize();				// ���� Queue�� �ִ� ���� ��ȯ
}
