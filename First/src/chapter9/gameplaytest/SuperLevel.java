package chapter9.gameplaytest;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("���������մϴ�.");
	}

	@Override
	public void jump() {
		System.out.println("���� Jump�� �մϴ�.");
		
	}

	@Override
	public void turn() {
		System.out.println("�� �� Turn�� �մϴ�.");
	}

	@Override
	public void showLevel() {
		System.out.println("�������Դϴ�.");
	}
	
	public String getLevel() {
		return "������";
	}
}