package chapter5; 		
// Student Ŭ������ ���� ��Ű���� �ֱ� ������ Student Ŭ������ ���� ���� �ҷ��� �� �ִ�.

public class StudentTest {
	// Ŭ���� ���ο��� �ٷ� main �Լ����� ��� ���� ����.
	public static void main(String[] args) {
		// Student������ �� Ŭ���� ����.
		Student studentAhn = new Student();
		studentAhn.studentName = "�Ƚ¿�";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
