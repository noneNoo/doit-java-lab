package chapter9.gameplaytest;

public class MainBoard {

	public static void main(String[] args) {
		// �÷��̾� �ν��Ͻ� ����
		Player playerAnzu = new Player("��Ÿ�� ����");
		
		// ���� �ν��Ͻ� ����
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		playerAnzu.play(1);
		
		playerAnzu.setLevel(aLevel);
		
		playerAnzu.play(2);
		
		playerAnzu.setLevel(sLevel);
		
		playerAnzu.play(4);
	}

}