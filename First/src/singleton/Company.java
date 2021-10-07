package singleton;

public class Company {
	// �̱��� ������ �⺻ ������(public)�� ����� �� ����.

	// �����ϰ� ������ �ν��Ͻ�
	private static Company instance = new Company();
	

	// private�� �����ڸ� ���������� �������־�� �Ѵ�.
	private Company() {
		
	}
	
	// ������ �� �ϳ��� �ν��Ͻ�(private)�� �ܺο��� ������ �� �ִ� public getter
	// �� getter�� �ν��Ͻ� ������ ��� ���� ȣ���� �� �־�� �ϱ� ������ static���� �����Ѵ�.
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;	// ������ �ν��Ͻ� ��ȯ
	}
}