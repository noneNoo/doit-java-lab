package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한 명씩 순서대로 할당.");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당.");
		System.out.println("P : 우선 순위가 높은 고객 먼저 할당.");
		System.out.println("A : ");
		
		// 할당 방식을 입력받는다.
		int ch = System.in.read();
		// Scheduler scheduler = new Scheduler(); 	오류남.
		
		Scheduler scheduler = null;
		
		// 입력값에 따라 클래스 대입
		
		switch (ch) {
		case 'r': case 'R':
			scheduler = new RoundRobin();
			break;
		case 'l': case 'L' :
			scheduler = new LeastJob();
			break;
		case 'p' : case 'P' :
			scheduler = new PriorityAllocation();
			break;
		case 'a' : case 'A' :
			scheduler = new AgentGetCall();
			break;
		default :
			System.out.println("지원되지 않는 기능입니다.");
	};
	
	scheduler.getNextCall();
	scheduler.sendCallToAgent();
	}
}
