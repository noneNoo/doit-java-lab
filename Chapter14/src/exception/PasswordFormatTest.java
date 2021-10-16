package exception;


public class PasswordFormatTest {
	private String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) throws PasswordException {
		// 비밀번호 조건: 영문과 한문을 모두 포함해야 하며, 문자열의 길이가 5이상이어야 한다.
		String pattern = "^[a-zA-Z]+";
		String pattern2 = "^[0-9]*$";
		
		if(userPassword == null) {
			throw new PasswordException("비밀번호는 비워둘 수 없습니다.");
		} else if (userPassword.matches(pattern) || userPassword.matches(pattern2)) {
			throw new PasswordException("비밀번호에 영문과 숫자를 함께 사용해주세요.");
		} else if (userPassword.length() < 5) {
			throw new PasswordException("비밀번호는 5자리 이상이어야 합니다");
		}
		
		this.userPassword = userPassword;
		System.out.println("비밀번호 설정이 완료되었습니다.");
	}

	public static void main(String[] args) {
		PasswordFormatTest test = new PasswordFormatTest();
		
		// 비밀번호가 영문으로만 이루어짐
		String userID1 = "asdf";
		try {
			test.setUserPassword(userID1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 비밀번호가 숫자로만 이루어짐
		String userID2 = "1111";
		try {
			test.setUserPassword(userID2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// 비밀번호가 5자리 이하
		String userID3 = "1a1b";
		try {
			test.setUserPassword(userID3);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		String userID4 = "1a1b1";
		try {
			test.setUserPassword(userID4);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
