package chapter9.gameplaytest;

public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("õõ�� �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump�� �� ������.");

	}

	@Override
	public void turn() {
		System.out.println("Turn�� �� ������.");
	}

	@Override
	public void showLevel() {
		System.out.println("�ʺ����Դϴ�.");
	}
	
	public String getLevel() {
		return "�ʺ���";
	}

}
