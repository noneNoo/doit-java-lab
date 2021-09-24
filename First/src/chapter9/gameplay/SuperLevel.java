package chapter9.gameplay;

public class SuperLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 Jump합니다.");
	}

	@Override
	public void turn() {
		System.out.println("한 번 Turn합니다.");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("* 고인물입니다. ㅋㅋ아 컨텐츠가부족하네 *");
	}

}
