package school;

public class Score {
	// 가져야 하는 정보
	// 학생 아이디(고유번호)
	private int studentId;
	// 과목 객체
	private Subject subject;
	// 점수
	private int point;
	
	// 점수 생성자
	public Score(int studentId, Subject subject, int point) {
		this.studentId = studentId;
		this.subject = subject;
		this.point = point;
	}
	
	// getters
	public int getStudentId() {
		return studentId;
	}
	public Subject getSubject() {
		return subject;
	}
	public int getPoint() {
		return point;
	}
	
	// setters
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	// toString메서드 오버라이딩
	public String toString() {
		return "학번: " + studentId + ", 과목: " + subject.getSubjectName() + ", 점수: " + point;
	}
}
