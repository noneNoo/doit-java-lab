package staticexample;

public class Student1 {
	// static���� ����ϱ�.
	
	// static������ �ν��Ͻ� ������ ��� ���� ���� �����ȴ�.
	// Student Ŭ������ ��� �ν��Ͻ����� �����ϴ� �����̴�.
	public static int serialNum = 1000; 

	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	// �⺻ ������
	// �л��� ������ ������ static ������ 1�� ����
	// ������ ���� �ش� �ν��Ͻ��� ������ �ο���.
	public Student1() {
		serialNum++;
		studentID = serialNum;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}