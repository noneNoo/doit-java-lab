package chapter9.gameplaytest;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("������ �޸��ϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("Jump�� �մϴ�.");
	}

	@Override
	public void turn() {
		System.out.println("Turn�� �� ������.");
	}

	@Override
	public void showLevel() {
		System.out.println("�߱����Դϴ�.");
	}
	
	public String getLevel() {
		return "�߱���";
	}

}