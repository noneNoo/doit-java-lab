package hiding;

public class Student {
	int studentId;
	
	// �̸� ������ private�� �ܺ� ���� ����
	private String studentName;
	int grade;
	public String address;

	// �ܺο��� private ������ �����Ϸ��� �Ʒ��� �޼��带 �̿��ؾ� �Ѵ�.
	
	// private�� ������ get�ϴ� getter �޼���
	public String getStudentName() {
		return studentName;
	}

	// private�� ������ get�ϴ� setter �޼���
	public void setStudentName(String newName) {
		this.studentName = newName;
	}
}
