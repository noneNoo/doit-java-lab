package school;

import java.util.ArrayList;
import utils.Define;


public class Subject {
	// �����ڵ�, �����
	private int subjectId;
	private String subjectName;
	
	// ���� ��� ��å
	private int gradeType;
	
	// �л� ����Ʈ
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	// �⺻ ������(������ �������� ����)
	public Subject(int subjectId, String subjectName) {
		this.subjectId = subjectId;
		this.subjectName = subjectName;
		this.gradeType = Define.AB_TYPE;
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
	public int getGradeType() {
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
