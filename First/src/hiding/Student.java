package hiding;

public class Student {
	int studentId;
	
	// 이름 변수를 private로 외부 접근 차단
	private String studentName;
	int grade;
	public String address;

	// 외부에서 private 변수에 접근하려면 아래의 메서드를 이용해야 한다.
	
	// private인 변수를 get하는 getter 메서드
	public String getStudentName() {
		return studentName;
	}

	// private인 변수를 get하는 setter 메서드
	public void setStudentName(String newName) {
		this.studentName = newName;
	}
}
