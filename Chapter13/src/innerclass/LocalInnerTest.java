package innerclass;

class Outer {
	int outNum = 100;
	static int sOutNum = 200;
	
	// 자바의 스레드를 만들 때 사용하는 Runnable 인터페이스
	Runnable getRunnable(int i) {
		int num = 100;		// 지역 변수는 상수(final 정적)로 값이 바뀐다
		
		// 지역 내부 클래스
		class MyRunnable implements Runnable {
			int localNum = 10;	

			@Override
			public void run() {
//				num += 10;	// 지역변수는 상수로 바뀌기 때문에 값을 수정할 수 없다
//				i += 10;	// 매개변수도 상수로 바뀌기 때문에 오류발생
				System.out.println("i = " + i);
				System.out.println("지역변수 num = " + num);
				System.out.println("localNum = " + localNum);
				System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
				System.out.println("Outer.sOutNum = " + Outer.sOutNum + "(외부 클래스 정적 변수)");
			}
		}
		
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
	}

}
