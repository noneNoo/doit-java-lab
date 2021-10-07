package generics;

public class GenericMethod {

	// 제너릭 메서드
	// 두 점(Point 자료형 인스턴스)을 매개변수로 받아 사각형의 넓이를 계산하는 메서드
	public static <T, V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {

		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		// 제너릭 메서드에 넣어줄 매개변수 포인트 2개를 생성한다.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		// 인스턴스에 다이아몬드 연산자만 사용하고 자료형을 명시하지 않아도 컴파일러가 앞에 선언된 자료형을 보고 유추할 수 있다.
		Point<Integer, Double> p2 = new Point<>(10,10.0);
		
		// 넓이 저장
		double rect = makeRectangle(p1, p2);
		
		System.out.println("두 점으로 만들어진 사각형의 넓이는" + rect + " 입니다.");
	}

}
