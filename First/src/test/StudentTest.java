package test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = '�̻��';  // private�� ���� �ٲ� �� ��� �����߻�.
		
		studentLee.setStudentName("�̻��");
		System.out.println(studentLee.getStudentName());
	}

}