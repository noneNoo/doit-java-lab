package chapter5; 		
// Student 클래스와 같은 패키지에 있기 때문에 Student 클래스를 문제 없이 불러올 수 있다.

public class StudentTest {
	// 클래스 내부에서 바로 main 함수에서 모든 일을 실행.
	public static void main(String[] args) {
		// Student형식의 새 클래스 생성.
		Student studentAhn = new Student();
		studentAhn.studentName = "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
