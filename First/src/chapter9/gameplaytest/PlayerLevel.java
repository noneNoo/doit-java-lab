package chapter9.gameplaytest;

public abstract class PlayerLevel {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	public abstract void showLevel();
	public abstract String getLevel();
	
	public void go(int count) {
		run();
		for(int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}
}
