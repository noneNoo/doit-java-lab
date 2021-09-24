package chapter9.gameplaytest;

public class MainBoard {

	public static void main(String[] args) {
		// 플레이어 인스턴스 생성
		Player playerAnzu = new Player("후타바 안즈");
		
		// 레벨 인스턴스 생성
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		playerAnzu.play(1);
		
		playerAnzu.setLevel(aLevel);
		
		playerAnzu.play(2);
		
		playerAnzu.setLevel(sLevel);
		
		playerAnzu.play(4);
	}

}
