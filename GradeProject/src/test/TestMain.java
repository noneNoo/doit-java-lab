package test;


import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;
import utils.Define;

public class TestMain {

	// 학교 싱글톤
	School goodSchool = School.getInstance();
	
	// 과목
	Subject korean;
	Subject math;
	Subject dance;
	
	// 리포트 클래스
	GenerateGradeReport gradeReport = new GenerateGradeReport();
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}

	private void createSubject() {
		korean = new Subject(Define.KOREAN, "국어");
		math = new Subject(Define.MATH, "수학");
		dance = new Subject(Define.DANCE, "방송댄스");
		
		dance.setGradeType(Define.PF_TYPE);
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		goodSchool.addSubject(dance);
		
		System.out.println("과목 생성 완료");
	}

	private void createStudent() {
		Student student1 = new Student(181213, "소이", korean);
		Student student2 = new Student(181214, "대쥐", math);
		Student student3 = new Student(181215, "단밤", korean);
		Student student4 = new Student(181216, "꼬북", math);
		Student student5 = new Student(181217, "냐무", korean);
		
		goodSchool.addStudent(student1);
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);
		
		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 54);
		addScoreForStudent(student1, dance, 70);
		
		addScoreForStudent(student2, korean, 100);
		addScoreForStudent(student2, math, 80);
		addScoreForStudent(student2, dance, 90);

		addScoreForStudent(student3, korean, 86);
		addScoreForStudent(student3, math, 94);
		addScoreForStudent(student3, dance, 80);
		
		addScoreForStudent(student4, korean, 97);
		addScoreForStudent(student4, math, 97);
		
		addScoreForStudent(student5, korean, 55);
		addScoreForStudent(student5, math, 55);
		
		System.out.println("학생 생성 완료");
	}

	// 과목별 점수를 추가하는 메서드
	private void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
		
	}
	

}
