package chapter9.gameplay;

public class MainBoard {

	public static void main(String[] args) {
		// 플레이어 인스턴스 생성
		Player p1 = new Player("냐무");
		Player p2 = new Player("모로보시 키라리");
		Player p3 = new Player("후타바 안즈");
		
		// 레벨 인스턴스 생성
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		// 레벨 지정
		p2.setLevel(aLevel);
		p3.setLevel(sLevel);

		p1.play(2);
		p2.play(1);
		p3.play(3);
		
		p3.setLevel(aLevel);
		
		p3.play(2);
	}

}
