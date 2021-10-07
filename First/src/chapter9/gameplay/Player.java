package chapter9.gameplay;

public class Player {
	// HAS A CLASS
	private PlayerLevel level;
	private String name;
	
	Player() {
		this("����");
	}
	
	Player(String name) {
		this.name = name;
		level = new BeginnerLevel();
	}
	
	public String getName() {
		return name;
	}
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void setLevel(PlayerLevel level) {
		this.level = level;
		System.out.println(name + " ���� ������ ����Ǿ����ϴ�.");
	}
	
	public void play(int count) {
		System.out.println("�÷��̾� �̸�: " + name);
		level.go(count);
		level.showLevelMessage();
		System.out.println(" ====== ");
	}
}