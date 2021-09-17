package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	// ������
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		// ���� array list ����
		subjectList = new ArrayList<Subject>();
	}
	
	// ���� ���� �߰�
	public void addSubject(String subName, int subScore) {
		// ���� subject��� class Ʋ�� �ҷ��´�
		Subject newSubject = new Subject();
		
		// private�� ��������� ���� ���ش�
		newSubject.setName(subName);
		newSubject.setScorePoint(subScore);
		
		// Student �ν��Ͻ��� ArrayList�� ������ ���� newSubject ��ü�� add �Ѵ�.
		subjectList.add(newSubject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject item : subjectList) {
			total += item.getScorePoint();
			System.out.println(studentName +"�л��� " + item.getName() +"���� ������ " + item.getScorePoint() + "���Դϴ�.");
		}
		
		System.out.println(studentName + "�л��� ������ " + total + "�Դϴ�.");
		
	}
}
