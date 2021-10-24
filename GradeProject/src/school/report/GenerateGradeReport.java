package school.report;

import java.util.ArrayList;

import grade.BasicEvaluation;
import grade.GradeEvaluation;
import grade.MarjorEvaluation;
import school.School;
import school.Score;
import school.Student;
import school.Subject;
import utils.Define;

// 통계를 한눈에 출력하기 위한 리포트 프로그램
public class GenerateGradeReport {
	School school = School.getInstance();

	
	public static final String TITLE = "수강생 학점 \t \t \n";
	public static final String HEADER = "이름 | 학번 | 전공 | 점수 \n";
	public static final String LINE = "--------------------------\n";
	
	// 문자열 추가를 위한 자료형
	private StringBuffer buffer = new StringBuffer();
	
	// 리포트를 반환하는 메서드
	public String getReport() {
		// 학교 객체에서 모든 과목을 가져온다
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		// 과목을 돌며 과목마다 메세지를 출력하는 메서드를 호출
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		
		return buffer.toString();
	}


	// 과목별로 Header를 만드는 메서드
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		
		// 과목명 + (수강생 학점(TITLE))
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	// 과목별로 Body를 만드는 메서드
	private void makeBody(Subject subject) {
		// 과목에 studentList가 포함되어 있음. 그것을 불러옴.
		ArrayList<Student> studentList = subject.getStudentList();
		
		// 수강생 목록 받아와서 순회
		for(int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			// 전공(필수과목)
			buffer.append(student.getMarjorSubject().getSubjectName());
			buffer.append(" | ");
			
			// 수강생 학점 계산 메서드
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	

	// 막줄 엔터
	private void makeFooter() {
		buffer.append("\n");
	}

	// 수강생 학점 계산 메서드
	private void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		
		// 필수과목 아이디 가져오기
		int majorId = student.getMarjorSubject().getSubjectId();

		
		// 학점 평가 클래스 배열 생성. 
		// gradeEvaluation의 0번 인덱스에는 기본 학점 계산 클래스가 구현되어 있고
		// 1번 인덱스에는 1번 인덱스에는 전공 학점 계산 클래스가 구현되어 있다.
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MarjorEvaluation()};
		
		for(int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			
			// 학점 산출할 과목
			if(score.getSubject().getSubjectId() == subjectId) {
				String grade;
				
				// 필수과목이라면
				if(score.getStudentId() == majorId) {
					// gradeEvaluation 배열의 1번 인덱스(MarjorEvaluation() 으로 접근하여 getGrade메서드 호출.)
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
				// 일반 과목이라면
					// gradeEvaluation 배열의 0번 인덱스(BasicEvaluation() 으로 접근하여 getGrade메서드 호출.)
					grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint());
				}
				
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}
}
