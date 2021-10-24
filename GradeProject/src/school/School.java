package school;

import java.util.ArrayList;

public class School {
	// 유일한 객체이므로 싱글톤 패턴
	private static School instance = new School();
	
	// static으로 School 객체를 선언하지 않아도 바로 getInstance 메서드로 인스턴스들을 호출하여 모든 기능을 이용할 수 있게끔 함.
	public static School getInstance() {
		if(instance == null) {
			instance = new School();
		}
		return instance;
	}

	// 학교명
	private static String SCHOOL_NAME = "Good School";
	
	// 학생 리스트
	private ArrayList<Student> studentList = new ArrayList<Student>();
	// 과목 리스트
	private ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	// 학생 추가 메서드
	public void addStudent(Student student) {
		studentList.add(student);
	}
	//과목 추가 메서드
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
