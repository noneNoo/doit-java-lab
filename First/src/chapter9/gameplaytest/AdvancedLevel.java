package chapter9.gameplaytest;

public class AdvancedLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("빠르게 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("Jump를 합니다.");
	}

	@Override
	public void turn() {
		System.out.println("Turn할 줄 모르지롱.");
	}

	@Override
	public void showLevel() {
		System.out.println("중급자입니다.");
	}
	
	public String getLevel() {
		return "중급자";
	}

}
