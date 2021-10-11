package innerclass;

// 외부 클래스 선언
class OutClass {
	// 외부 클래스의 private 멤버변수
	private int num = 10;
	// 외부 클래스의 private 정적 변수
	private static int sNum = 20;
	
	//내부 클래스이 자료형 변수를 먼저 선언한다
	private InClass inClass;
	
	
	// 외부 클래스의 디폴트 생성자
	public OutClass() {
		System.out.println("외부 클래스 생성자 호출!");
		// 외부 클래스 생성이 되면 그 후에야 내부 클래스가 생성이 된다.
		inClass = new InClass();
		System.out.println("내부 클래스 생성 완료!");
	}
	
	// 정적 내부 클래스 정의
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 100; // 정적 변수 사용 가능
		
		// 정적 클래스의 '일반 메서드'
		void inTest() {
//			num += 10;		// 외부 클래스의 인스턴스 변수를 사용할 수 없다!
			System.out.println("InStaticClass inNum: " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNum: " + sInNum + "(내부 클래스의 정적 변수 사용)");
			System.out.println("OutClass sNum: " + sNum + "(외부 클래스의 정적 변수 사용 가능)");
		}
		
		// 정적 클래스의 '정적 메서드' (정적 변수만 사용 가능)
		static void sTest() {
//			num += 10;		// 외부 클래스의 인스턴스 변수를 사용할 수 없다 
//			inNum += 10;	// 내부 클래스의 인스턴스 변수도 사용할 수 없다
			// 외부와 해당 내부 클래스에서 오로지 정적 변수들만 사용 가능하다.
			System.out.println("OutClass sNum: " + sNum + "(외부 클래스의 정적 변수 사용 가능)");
			System.out.println("InStaticClass sInNum: " + sInNum + "(내부 클래스의 정적 변수 사용 가능)");
		}
	}
	
	// 내부 클래스 정의
	class InClass {
		int inNum = 100;
//		static int sNum2 = 200; // 인스턴스 내부 클래스에 static(정적 변수) 선언 불가능

		void inTest() {
			System.out.println("OutClass num: " + num + " (외부 클래스의 인스턴스 변수)");
			System.out.println("InClass num: " + sNum + " (외부 클래스의 static 변수)");
		}

		
//		static void sTest() {} // static메서드 역시 생성 불가능
	}

	// 외부 클래스 메서드에서 내부 클래스의 메서드 호출
	public void usingClass() {
		// 생성자에서 이미 inClass 인스턴스가 생성된 상태라 정상적으로 사용할 수 있다.
		inClass.inTest();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("== 외부 클래스 이용하여 내부 클래스 기능 호출 ==");
		
		// 다르 클래스에서 인스턴스 내부 클래스 생성하기
		outClass.usingClass();
		System.out.println();
		
		// 외부 클래스를 생성하지 않고 그 안의 static 정적 내부 클래스를 생성 할 수 있음!
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		System.out.println("== 정적 내부 클래스의 일반 메서드 호출 ==");
		sInClass.inTest();	// 일반 메서드
		
		System.out.println();
		
		System.out.println("== 정적 내부 클래스의 정적 메서드 호출 ==");
		sInClass.sTest();	// 정적 메서드
		
	}

}
