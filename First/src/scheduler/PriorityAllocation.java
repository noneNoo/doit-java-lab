package scheduler;

// 고객 등급이 높은 고객의 전화부터 받아와
// 업무 능력이 높은 상담원에게 우선 배분
// 이래도 되나
public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객 등급이 높은 고객부터 전화를 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 skill 값이 높은 상담원에게 우선 배분합니다.");
	}

}
