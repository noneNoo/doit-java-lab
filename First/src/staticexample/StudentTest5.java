package staticexample;

public class StudentTest5 {

	public static void main(String[] args) {
		Student3 studentSoi = new Student3();
		studentSoi.setStudentName("박소이");
		System.out.println(studentSoi.cardNum);
		System.out.println(studentSoi.studentID);
		
		Student3 studentAnzu = new Student3();
		studentAnzu.setStudentName("후타바 안즈");

		System.out.println(studentAnzu.cardNum);
		System.out.println(studentAnzu.studentID);
	}

}
