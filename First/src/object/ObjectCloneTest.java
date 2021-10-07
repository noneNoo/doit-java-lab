package object;

class Point {
	int x;
	int y;
	
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// toString() 오버라이딩
	public String toString() {
		return x + ", " +y;
	}
}

// 객체를 복사해도 된다는 의미와 함께 인터페이스 선언
class Circle implements Cloneable {
	Point point;
	int radius;
	
	Circle(int x, int y, int radius) {
		this.radius = radius;
		this.point = new Point(x, y);
	}
	
	public String toString() {
		return "원점은" + point + "이고, " + "반지름은 " + radius + "입니다.";
	}
	
	// clone메서드를 사용할 때 발생하는 오류를 예외처리하는 코드
	public Object clone() throws CloneNotSupportedException {
		// 
		return super.clone();
	}
}

public class ObjectCloneTest {

	// 오류 예외처리
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10,20,30);
		
		Circle copyCircle = (Circle)circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
		
	}

}
