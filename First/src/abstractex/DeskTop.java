package abstractex;

public class DeskTop extends Computer {

	// 상속받은 추상메서드의 구현의 의무도 그대로 넘어오기 때문에
	// 1. 여기서 추상메서드를 구현한다
	// 2. 해당 클래스를 추상클래스로 변환한다 (다시 하위클래스로 구현을 미룸)
	
	@Override
	public void display() {
		System.out.println("DeskTop display()");
	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}
	
}
