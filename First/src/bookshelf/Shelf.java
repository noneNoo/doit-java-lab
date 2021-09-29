package bookshelf;

import java.util.ArrayList;

// Shelf (선반) 클래스
public class Shelf {
	// protected 접근제어자: 패키지 내의 클래스, 해당 클래스를 상속받은 외부 클래스에서만 사용 가능하다.
	// 빈 ArrayList를 선언만 해둔 상태
	// 여기에 자료를 순서대로 저장할 것이다.
	protected ArrayList<String> shelf;
	
	// 디폴트 생성자로 Shelf 클래스를 생성하면 ArrayList도 생성됨.
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	// ArrayList 반환하는 getter
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
