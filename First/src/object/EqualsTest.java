package object;

class Student{
	int studentID;
	String studentName;
	
	// ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	// �޼��� �������̵�
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	// equals �޼��� �������̵�
	public boolean equals(Object obj) {
		// ���ڷ� ���� �ν��Ͻ��� �л������� ����ȯ�Ѵ�.
		Student std = (Student)obj;
		
		if(obj instanceof Student) {
			
			// �л� ���̵��� ������ ���� �л����� �ν��Ѵ�.
			if(this.studentID == std.studentID) {
				System.out.println("���̵���� ���Ƽ� �����ι���");
				System.out.println("========");
				return true;
			} else {
				System.out.println("�л� ���̵� �޶� �۳���..");
				System.out.println("========");
				return false;
			}
		} else {
			System.out.println("���� �ٸ����� �־���... �����߻�");
			System.out.println("========");
			return false;
		}
	}
	
	public int HashCode() {
		return studentID;
	}
	
}

// Equals Test �����Լ�
public class EqualsTest {
	public static void main(String[] args) {
		// �ν��Ͻ� ����
		Student studentSoi = new Student(100, "�ڼ���");
		Student studentSoiCopy = studentSoi; // �ν��Ͻ� ����
		//���� �� �ν��Ͻ��� ���޸𸮿��� ���� �ּҰ��� ����Ű�� �ȴ�.
		
		Student studentSoi2 = new Student(100, "�ڼ���");
		Student studentAnzu = new Student(200, "��Ÿ�� ����");
		
		studentSoi.equals(studentAnzu);

		// ===============
		// 1. �ν��Ͻ��� �������� ������ ��
		// 1-1. == ��ȣ�� '����������' ���޸��� '�ּҰ�'���� ��.
		if(studentSoi == studentSoiCopy) {
			System.out.println("StudentSoi �� Copy�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("StudentSoi �� Copy�� �ּҴ� �ٸ��ϴ�");
		}
		
		// 1-2. �ν��Ͻ��� equals�� �� ���� ��ġ�ϴ��� (��������)��
		// equals() �޼���
		if(studentSoi.equals(studentSoiCopy)) {
			System.out.println("StudentSoi�� Copy�� �����մϴ�.");
		} else {
			System.out.println("StudentSoi�� Copy�� �������� �ʽ��ϴ�.");
		}

		// ===============
		// 2. ���������� ��ġ�ϴ� ���� ���� �ν��Ͻ����� ��
		// 2-1. == ��ȣ�� '����������' ���޸��� '�ּҰ�'���� ��.
		if(studentSoi == studentSoi2) {
			System.out.println("studentSoi�� studentSoi2�� �ּҴ� �����ϴ�.");
		} else {
			System.out.println("studentSoi�� studentSoi2�� �ּҴ� �ٸ��ϴ�.");
		}

		// 2-2. �ν��Ͻ��� equals�� �� ���� ��ġ�ϴ��� (��������)��
		if(studentSoi.equals(studentSoi2)) {
			System.out.println("studentSoi�� studentSoi2�� �����մϴ�");
		} else {
			System.out.println("studentSoi�� studentSoi2�� �������� �ʽ��ϴ�.");
		}
		
		// =====
		
		System.out.println(studentSoi.HashCode());
		System.out.println(studentSoi2.HashCode());
		System.out.println(studentAnzu.HashCode());
		
		System.out.println("=====");

		// ���� �ν��Ͻ��� �ּҰ�
		System.out.println(System.identityHashCode(studentSoi));
		System.out.println(System.identityHashCode(studentSoi2));
		
		
	}

}