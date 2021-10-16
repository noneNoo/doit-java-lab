package exception;

public class IDFormatTest {
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	// IDFormatException ���� ó���� setUser()�޼��带 ȣ���� �� ó���ϵ��� �̷��.
	public void setUserID(String userID) throws IDFormatException {
		if(userID == null) {
			throw new IDFormatException("���̵�� null�� �� �����ϴ�.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("���̵�� 8�� �̻� 20�� ���Ϸ� ������.");
		}
		this.userID = userID;
		System.out.println(userID + "���� ���̵� �����Ǿ����ϴ�.");
	}
 	public static void main(String[] args){
		IDFormatTest test = new IDFormatTest();
		
		// 1. ���̵� null�� ��� ����ó��
		String userID = null;
		try {
			// ������ �߻������� �𸣴� �ڵ�
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// ������ ó���ϴ� �ڵ�
			System.out.println(e.getMessage());
		}
		
		// 2. ���̵� 8�̻��� �ƴ� ���
		userID = "1234567";
		try {
			// ������ �߻������� �𸣴� �ڵ�
			test.setUserID(userID);
		} catch (IDFormatException e) {
			// ������ ó���ϴ� �ڵ�
			System.out.println(e.getMessage());
		}
		
		// 3. ����ó�� �Ǵ� ���
		userID = "dsfahfafds";
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
 	

}
