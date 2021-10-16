package exception;

public class IDFormatException extends Exception {
	// 예외 상황 메세지를 생성자에서 입력받음
	public IDFormatException(String message) {
		// Exception(상위클래스) 의 메세지 기능
		super(message);
	}
}
