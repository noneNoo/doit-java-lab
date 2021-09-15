package staticexample;

public class Student3 {
	private static int serialNum = 1000; 
	
	public int studentID;
	public int cardNum;
	public String studentName;
	public int grade;
	public String address;
	
	// �⺻ ������
	// �л��� ������ ������ static ������ 1�� ����
	// ������ ���� �ش� �ν��Ͻ��� ������ �ο���.
	public Student3() {
		serialNum++;
		cardNum = serialNum + 100;
		studentID = serialNum;
		
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
