package test;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
//		studentLee.studentName = '이상원';  // private를 직접 바꿀 수 없어서 오류발생.
		
		studentLee.setStudentName("이상원");
		System.out.println(studentLee.getStudentName());
	}

}
