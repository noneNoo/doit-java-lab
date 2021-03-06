package chapter9.gameplaytest;

public class Player {
	private String name;
	private PlayerLevel level;
	 
	 // 기본 생성자 호출시 name을 모험가로 설정
	 Player() {
		this("모험가");
	}
	 
	 // 생성자 2. name을 설정한 후 초보자로 설정
	 Player(String name) {
		this.name = name;
		level = new BeginnerLevel();
	}
	
	// 레벨 setter
	public void setLevel(PlayerLevel level) {
		this.level = level;
	}
	
	public void play(int count) {
		System.out.println(name + "님의 직업은 <" + level.getLevel() + "> 입니다.");
		level.go(count);
		System.out.println("======");
	}

	
	
}
