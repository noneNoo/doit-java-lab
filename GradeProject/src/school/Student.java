package school;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentId;
	private Subject marjorSubject;
	
	// 학생이 수강한 과목의 점수 리스트.
	// addSubjectScore() 메서드가 실행되면 이 리스트에 Score가 추가된다.
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	// 생성자
	public Student(int studentId, String studentName, Subject marjorSubject) {
		// 학번, 이름, 전공
		this.studentId = studentId;
		this.studentName = studentName;
		this.marjorSubject = marjorSubject;
	}
	
	// Score 추가 메서드
	public void addSubjectScore(Score score) {
		scoreList.add(score);
	}
	
	// getter
	public String getStudentName() {
		return studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public Subject getMarjorSubject() {
		return marjorSubject;
	}
	public ArrayList<Score> getScoreList() {
		return scoreList;
	}
	
	// setter
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setMarjorSubject(Subject marjorSubject) {
		this.marjorSubject = marjorSubject;
	}
	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
}
