package exception;

public class AutoClassTest {

	public static void main(String[] args) {
		// �ڹ� 8 ����: try�� ��ȣ �ȿ� ����� ���ҽ��� ����
		try(AutoCloseObj obj = new AutoCloseObj()) {
			// ���� ���� �߻�
//			throw new Exception();
		} catch(Exception e) {
			System.out.println("����ó�� �κ��Դϴ�.");
		}
		
		// �ڹ� 9 ����: �ܺο��� ����� ���ҽ��� �����ص� ����
		AutoCloseObj obj2 = new AutoCloseObj();
		try(obj2) {
			System.out.println("obj2 try");
		} catch(Exception e) {
			System.out.println("ojb2�� ����ó�� �κ��Դϴ�.");
		}
	}

}
