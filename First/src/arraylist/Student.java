package arraylist;

import java.util.ArrayList;

public class Student {
	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;
	
	// 생성자
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		
		// 과목 array list 생성
		subjectList = new ArrayList<Subject>();
	}
	
	// 수강 과목 추가
	public void addSubject(String subName, int subScore) {
		// 먼저 subject라는 class 틀을 불러온다
		Subject newSubject = new Subject();
		
		// private인 멤버변수를 세팅 해준다
		newSubject.setName(subName);
		newSubject.setScorePoint(subScore);
		
		// Student 인스턴스의 ArrayList에 세팅이 끝난 newSubject 객체를 add 한다.
		subjectList.add(newSubject);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject item : subjectList) {
			total += item.getScorePoint();
			System.out.println(studentName +"학생의 " + item.getName() +"과목 성적은 " + item.getScorePoint() + "점입니다.");
		}
		
		System.out.println(studentName + "학생의 총점은 " + total + "입니다.");
		
	}
}
