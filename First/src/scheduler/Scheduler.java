package scheduler;

public interface Scheduler {
	// ��ȭ�� �ҷ����� �޼���
	public void getNextCall();
	
	// ������ �Ҵ��ϴ� �޼���
	public void sendCallToAgent();
}
