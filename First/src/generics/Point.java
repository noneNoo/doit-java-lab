package generics;

// 2개의 자료형 매개변수를 받는 제네릭 클래스
public class Point<T, V> {
	T x;
	V y;
	
	// 생성자
	Point (T x, V y) {
		this.x = x;
		this.y= y;
	}
	
	// 제네릭 메서드
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
