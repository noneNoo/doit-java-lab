package staticexample;

public class Student {
	// static변수 사용하기.
	
	// static변수는 인스턴스 생성과 상관 없이 먼저 생성된다.
	// Student 클래스의 모든 인스턴스들이 공유하는 변수이다.
	public static int serialNum = 1000; 

	
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
}
