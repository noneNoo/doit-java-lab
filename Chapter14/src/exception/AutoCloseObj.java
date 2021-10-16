package exception;

// ����ó�� try�� �Ű������� ���� ���ҽ� �ڵ忡
// �ڵ����� close���ִ� AutoCloseable �������̽��� �����Ѵ�.
public class AutoCloseObj implements AutoCloseable {

	@Override
	public void close() throws Exception {
		// close �ϴ� ���, Ȯ�ο����� ��¹��� ����� �޼��� �������̵�
		System.out.println("���ҽ��� close() �Ǿ����ϴ�.");
	}

}
