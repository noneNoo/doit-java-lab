package chapter9.gameplaytest;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("전력질주합니다.");
	}

	@Override
	public void jump() {
		System.out.println("높이 Jump를 합니다.");
		
	}

	@Override
	public void turn() {
		System.out.println("한 번 Turn을 합니다.");
	}

	@Override
	public void showLevel() {
		System.out.println("고급자입니다.");
	}
	
	public String getLevel() {
		return "고급자";
	}
}
