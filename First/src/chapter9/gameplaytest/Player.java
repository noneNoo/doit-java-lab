package chapter9.gameplaytest;

public class Player {
	private String name;
	private PlayerLevel level;
	 
	 // �⺻ ������ ȣ��� name�� ���谡�� ����
	 Player() {
		this("���谡");
	}
	 
	 // ������ 2. name�� ������ �� �ʺ��ڷ� ����
	 Player(String name) {
		this.name = name;
		level = new BeginnerLevel();
	}
	
	// ���� setter
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
		System.out.println(name + "���� ������ <" + level.getLevel() + "> �Դϴ�.");
		level.go(count);
		System.out.println("======");
	}

	
	
}