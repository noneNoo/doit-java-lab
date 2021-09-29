package scheduler;

public interface Scheduler {
	// 전화를 불러오는 메서드
	public void getNextCall();
	
	// 상담원을 할당하는 메서드
	public void sendCallToAgent();
}
