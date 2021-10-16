package exception;


public class PasswordFormatTest {
	private String userPassword;
	
	public String getUserPassword() {
		return userPassword;
	}
	
	public void setUserPassword(String userPassword) throws PasswordException {
		// ��й�ȣ ����: ������ �ѹ��� ��� �����ؾ� �ϸ�, ���ڿ��� ���̰� 5�̻��̾�� �Ѵ�.
		String pattern = "^[a-zA-Z]+";
		String pattern2 = "^[0-9]*$";
		
		if(userPassword == null) {
			throw new PasswordException("��й�ȣ�� ����� �� �����ϴ�.");
		} else if (userPassword.matches(pattern) || userPassword.matches(pattern2)) {
			throw new PasswordException("��й�ȣ�� ������ ���ڸ� �Բ� ������ּ���.");
		} else if (userPassword.length() < 5) {
			throw new PasswordException("��й�ȣ�� 5�ڸ� �̻��̾�� �մϴ�");
		}
		
		this.userPassword = userPassword;
		System.out.println("��й�ȣ ������ �Ϸ�Ǿ����ϴ�.");
	}

	public static void main(String[] args) {
		PasswordFormatTest test = new PasswordFormatTest();
		
		// ��й�ȣ�� �������θ� �̷����
		String userID1 = "asdf";
		try {
			test.setUserPassword(userID1);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// ��й�ȣ�� ���ڷθ� �̷����
		String userID2 = "1111";
		try {
			test.setUserPassword(userID2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		// ��й�ȣ�� 5�ڸ� ����
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
