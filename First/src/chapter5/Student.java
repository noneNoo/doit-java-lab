package chapter5;

// �л�(student)��� Ŭ������ �����غ���.
public class Student {
	// �� �Ӽ����� �����غ���.
	int studentId;			// �й�
	String studentName;		// �л� �̸�
	int grade;				// �г�
	int address;			// �ּ���
	
	// �̸��� �ּҸ� ����ϴ� �޼��� ����
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	// getter �޼���
	public String getStudentName() {
		return studentName;
	}
	
	// setter �޼���
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// Ŭ���� ���ο� main�Լ��� ����
	public static void main(String[] args) {
		// Student������ �� Ŭ���� ����.
		Student studentAhn = new Student();
		// ������ ��ü�� �������(studentName)�� ���� �Ҵ�.
		studentAhn.studentName = "�ȿ���";
		
		
		// �̸��� ����غ���.
		
		// ��������� ���� ��������
		System.out.println(studentAhn.studentName);
		
		// ��������� �������� �޼��带 �̿��ϱ�
		System.out.println(studentAhn.getStudentName());
	}
}