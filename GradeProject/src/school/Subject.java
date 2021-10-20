package school;

import java.util.ArrayList;


public class Subject {
	// 과목코드, 과목명
	private int subjectId;
	private String subjectName;
	
	// 학점 계산 정책
	private char gradeType;
	
	// 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	// 생성자
	Subject(int subjectId, String subjectName, char gradeType) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = gradeType;
	}
	
	// student 추가하는 메서드(수강신청)
	public void register(Student student) {
		studentList.add(student);
	}
	
	// getters
	public int getSubjectId() {
		return subjectId;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public char getGradeType() {
		return gradeType;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	// setters
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public void setGradeType(char gradeType) {
		this.gradeType = gradeType;
	}
	public void setArrayList (ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
}
