package chapter5;

public class StudentTest1 {

	public static void main(String[] args) {
		// �ν��Ͻ� 1�� ����
		Student student1 = new Student();
		student1.studentName = "�ڼ���";
		System.out.println(student1.getStudentName());
		
		// �ν��Ͻ� 2�� ����
		Student student2 = new Student();
		student2.studentName = "ȫ�浿";
		System.out.println(student2.getStudentName());
	}

}