package school;

import java.util.ArrayList;

public class Student {
	private String studentName;
	private int studentId;
	private Subject marjorSubject;
	
	// �л��� ������ ������ ���� ����Ʈ.
	// addSubjectScore() �޼��尡 ����Ǹ� �� ����Ʈ�� Score�� �߰��ȴ�.
	private ArrayList<Score> scoreList = new ArrayList<Score>();
	
	// ������
	public Student(int studentId, String studentName, Subject marjorSubject) {
		// �й�, �̸�, ����
		this.studentId = studentId;
		this.studentName = studentName;
		this.marjorSubject = marjorSubject;
	}
	
	// Score �߰� �޼���
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
