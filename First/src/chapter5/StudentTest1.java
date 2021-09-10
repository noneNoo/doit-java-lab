package chapter5;

public class StudentTest1 {

	public static void main(String[] args) {
		// 인스턴스 1개 생성
		Student student1 = new Student();
		student1.studentName = "박소이";
		System.out.println(student1.getStudentName());
		
		// 인스턴스 2개 생성
		Student student2 = new Student();
		student2.studentName = "홍길동";
		System.out.println(student2.getStudentName());
	}

}
