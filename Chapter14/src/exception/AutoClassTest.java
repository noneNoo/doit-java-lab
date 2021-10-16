package exception;

public class AutoClassTest {

	public static void main(String[] args) {
		// 자바 8 이전: try문 괄호 안에 사용할 리소스를 선언
		try(AutoCloseObj obj = new AutoCloseObj()) {
			// 강제 예외 발생
//			throw new Exception();
		} catch(Exception e) {
			System.out.println("예외처리 부분입니다.");
		}
		
		// 자바 9 이후: 외부에서 사용할 리소스를 선언해도 괜춘
		AutoCloseObj obj2 = new AutoCloseObj();
		try(obj2) {
			System.out.println("obj2 try");
		} catch(Exception e) {
			System.out.println("ojb2의 예외처리 부분입니다.");
		}
	}

}
