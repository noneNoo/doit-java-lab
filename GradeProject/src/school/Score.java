package school;

public class Score {
	// ������ �ϴ� ����
	// �л� ���̵�(������ȣ)
	private int studentId;
	// ���� ��ü
	private Subject subject;
	// ����
	private int point;
	
	// ���� ������
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
	
	// toString�޼��� �������̵�
	public String toString() {
		return "�й�: " + studentId + ", ����: " + subject.getSubjectName() + ", ����: " + point;
	}
}
