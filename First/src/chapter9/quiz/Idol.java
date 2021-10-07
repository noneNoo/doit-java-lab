package chapter9.quiz;

public class Idol {
	public String name;
	private IdolType type;
	// ���εེ ��� ����
	private boolean isPassed;
	
	Idol(String name, IdolType type) {
		this.name = name;
		this.type = type;
	}
	
	public void produce(int count) {
		System.out.println(name + ": ������ �غ���!");
		
		this.isPassed = type.go(count);
		
		if(isPassed) {
			System.out.println("�հ��Դϴ�.");
			System.out.println(name + ": ���!");
		} else {
			System.out.println("Ż���Դϴ�.");
			System.out.println(name + ": �ƿ��...");
		}
	}

}