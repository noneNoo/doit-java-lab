package chapter9.gameplay;

public class Player {
	// HAS A CLASS
	private PlayerLevel level;
	private String name;
	
	Player() {
		this("ㅎㅎ");
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
		System.out.println(name + " 님의 레벨이 변경되었습니다.");
	}
	
	public void play(int count) {
		System.out.println("플레이어 이름: " + name);
		level.go(count);
		level.showLevelMessage();
		System.out.println(" ====== ");
	}
}
