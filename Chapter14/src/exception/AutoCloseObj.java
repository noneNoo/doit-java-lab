package exception;

// 예외처리 try에 매개변수로 넣을 리소스 코드에
// 자동으로 close해주는 AutoCloseable 인터페이스를 구현한다.
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// close 하는 대신, 확인용으로 출력문만 남기는 메서드 오버라이드
		System.out.println("리소스가 close() 되었습니다.");
	}

}
