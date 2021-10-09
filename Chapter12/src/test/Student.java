package test;

public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int id, String name) {
		this.setStudentId(id);
		this.setStudentName(name);
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() {
		return studentId + ": " + studentName;
	}
	
}
