package chapter9.gameplay;

public class MainBoard {

	public static void main(String[] args) {
		// �÷��̾� �ν��Ͻ� ����
		Player p1 = new Player("�Ĺ�");
		Player p2 = new Player("��κ��� Ű��");
		Player p3 = new Player("��Ÿ�� ����");
		
		// ���� �ν��Ͻ� ����
		AdvancedLevel aLevel = new AdvancedLevel();
		SuperLevel sLevel = new SuperLevel();
		
		// ���� ����
		p2.setLevel(aLevel);
		p3.setLevel(sLevel);

		p1.play(2);
		p2.play(1);
		p3.play(3);
		
		p3.setLevel(aLevel);
		
		p3.play(2);
	}

}