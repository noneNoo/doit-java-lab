package school;

import java.util.ArrayList;


public class Subject {
	// �����ڵ�, �����
	private int subjectId;
	private String subjectName;
	
	// ���� ��� ��å
	private char gradeType;
	
	// �л� ����Ʈ
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	// ������
	Subject(int subjectId, String subjectName, char gradeType) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = gradeType;
	}
	
	// student �߰��ϴ� �޼���(������û)
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
