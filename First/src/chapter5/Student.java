package chapter5;

// 학생(student)라는 클래스를 생성해보자.
public class Student {
	// 그 속성들을 정의해보자.
	int studentId;			// 학번
	String studentName;		// 학생 이름
	int grade;				// 학년
	public String address;			// 주소지
	
	// 이름과 주소를 출력하는 메서드 생성
	public void showStudentInfo() {
		System.out.println(studentName + "," + address);
	}
	
	// getter 메서드
	public String getStudentName() {
		return studentName;
	}
	
	// setter 메서드
	public void setStudentName(String name) {
		studentName = name;
	}
	
	// 클래스 내부에 main함수를 생성
	public static void main(String[] args) {
		// Student형식의 새 클래스 생성.
		Student studentAhn = new Student();
		// 생성한 객체의 멤버변수(studentName)에 값을 할당.
		studentAhn.studentName = "안연수";
		
		
		// 이름을 출력해보자.
		
		// 멤버변수를 직접 가져오기
		System.out.println(studentAhn.studentName);
		
		// 멤버변수를 가져오는 메서드를 이용하기
		System.out.println(studentAhn.getStudentName());
	}
}
