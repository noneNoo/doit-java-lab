package scheduler;

import java.io.IOException;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �� �� ������� �Ҵ�.");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�.");
		System.out.println("P : �켱 ������ ���� �� ���� �Ҵ�.");
		System.out.println("A : ");
		
		// �Ҵ� ����� �Է¹޴´�.
		int ch = System.in.read();
		// Scheduler scheduler = new Scheduler(); 	������.
		
		Scheduler scheduler = null;
		
		// �Է°��� ���� Ŭ���� ����
		
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
			System.out.println("�������� �ʴ� ����Դϴ�.");
	};
	
	scheduler.getNextCall();
	scheduler.sendCallToAgent();
	}
}
