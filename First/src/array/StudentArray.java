package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[3];

		students[0] = new Student("�ڼ���");
		students[1] = new Student("���");
		students[2] = new Student("�Ĺ�");
		
		for(int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}
	}

}
