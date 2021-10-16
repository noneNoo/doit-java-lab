package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	// IDFormatException 예외 처리를 setUser()메서드를 호출할 때 처리하도록 미룬다.
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("아이디는 null일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 쓰세요.");
		}
		this.userID = userID;
		System.out.println(userID + "님의 아이디가 생성되었습니다.");
	}
 	public static void main(String[] args){
		IDFormatTest test = new IDFormatTest();
		
		// 1. 아이디가 null일 경우 예외처리
		String userID = null;
		try {
			// 오류가 발생할지도 모르는 코드
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// 오류를 처리하는 코드
			System.out.println(e.getMessage());
		}
		
		// 2. 아이디가 8이상이 아닐 경우
		userID = "1234567";
		try {
			// 오류가 발생할지도 모르는 코드
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// 오류를 처리하는 코드
			System.out.println(e.getMessage());
		}
		
		// 3. 정상처리 되는 경우
		userID = "dsfahfafds";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
 	

}
