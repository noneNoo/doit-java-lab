package staticexample;

public class Student3 {
	private static int serialNum = 1000; 
	
	public int studentID;
	public int cardNum;
	public String studentName;
	public int grade;
	public String address;
	
	// 기본 생성자
	// 학생이 생성될 때마다 static 변수가 1씩 증가
	// 증가된 값을 해당 인스턴스의 변수에 부여함.
	public Student3() {
		serialNum++;
		cardNum = serialNum + 100;
		studentID = serialNum;
		
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) {
		Student3.serialNum = serialNum;
	}
}
