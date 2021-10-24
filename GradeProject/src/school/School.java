package school;

import java.util.ArrayList;

public class School {
	// ������ ��ü�̹Ƿ� �̱��� ����
	private static School instance = new School();
	
	// static���� School ��ü�� �������� �ʾƵ� �ٷ� getInstance �޼���� �ν��Ͻ����� ȣ���Ͽ� ��� ����� �̿��� �� �ְԲ� ��.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	// �б���
	private static String SCHOOL_NAME = "Good School";
	
	// �л� ����Ʈ
	private ArrayList<Student> studentList = new ArrayList<Student>();
	// ���� ����Ʈ
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	// �л� �߰� �޼���
	public void addStudent(Student student) {
		studentList.add(student);
	}
	//���� �߰� �޼���
	public void addSubject(Subject subject) {
		subjectList.add(subject);
	}
	
	// getter
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	
	public ArrayList<Subject> getSubjectList() {
		return subjectList;
	}
		
}
