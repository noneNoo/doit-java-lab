package innerclass;


class Outer2 {
	// Runnable 타입을 반환하는 메서드
	Runnable getRunnable(int i) {
		int num = 100;
		
		// 익명 내부 클래스
		// 이름을 빼고 클래스를 생성 => 바로 반환해버린다.
		return new Runnable() {

			@Override
			public void run() {
				System.out.println(i);
				System.out.println(num);
				System.out.println("Runnable이 구현된 익명 클래스를 리턴");
			}		
		};		// 익명클래스는 끝에 ; 를 씀
	}
	
	// 익명 내부 클래스는 변수에 대입할 수도 있다.
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
		
	};
	
}
public class AnonymousInnerTest {
	
	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runnerble = out.getRunnable(10);
		
		// 익명 내부 클래스 리턴
		runnerble.run();
		
		// 익명 내부 클래스를 변수로
		out.runner.run();
	}

}
