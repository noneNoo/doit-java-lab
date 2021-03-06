package abstractex;

public abstract class NoteBook extends Computer {

	// 상속받은 추상메서드의 구현의 의무도 그대로 넘어오기 때문에
	// 1. 여기서 추상메서드를 구현한다
	public void display() {
		System.out.println("NoteBook display()");
	}
	
	// 2. 해당 클래스와 메서드를 전부 추상메서드로 변환한다 (다시 하위클래스로 구현을 미룸)
	// typing()은 여기서 구현하지 않고 하위 클래스로 구현을 미뤘다.
}
