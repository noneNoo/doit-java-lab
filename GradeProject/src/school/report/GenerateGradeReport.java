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

// ��踦 �Ѵ��� ����ϱ� ���� ����Ʈ ���α׷�
public class GenerateGradeReport {
	School school = School.getInstance();

	
	public static final String TITLE = "������ ���� \t \t \n";
	public static final String HEADER = "�̸� | �й� | ���� | ���� \n";
	public static final String LINE = "--------------------------\n";
	
	// ���ڿ� �߰��� ���� �ڷ���
	private StringBuffer buffer = new StringBuffer();
	
	// ����Ʈ�� ��ȯ�ϴ� �޼���
	public String getReport() {
		// �б� ��ü���� ��� ������ �����´�
		ArrayList<Subject> subjectList = school.getSubjectList();
		
		// ������ ���� ���񸶴� �޼����� ����ϴ� �޼��带 ȣ��
		for (Subject subject : subjectList) {
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		
		return buffer.toString();
	}


	// ���񺰷� Header�� ����� �޼���
	public void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		
		// ����� + (������ ����(TITLE))
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE);
		
		buffer.append(GenerateGradeReport.HEADER);
		buffer.append(GenerateGradeReport.LINE);
	}

	// ���񺰷� Body�� ����� �޼���
	private void makeBody(Subject subject) {
		// ���� studentList�� ���ԵǾ� ����. �װ��� �ҷ���.
		ArrayList<Student> studentList = subject.getStudentList();
		
		// ������ ��� �޾ƿͼ� ��ȸ
		for(int i = 0; i < studentList.size(); i++) {
			Student student = studentList.get(i);
			
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			// ����(�ʼ�����)
			buffer.append(student.getMarjorSubject().getSubjectName());
			buffer.append(" | ");
			
			// ������ ���� ��� �޼���
			getScoreGrade(student, subject.getSubjectId());
			
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	

	// ���� ����
	private void makeFooter() {
		buffer.append("\n");
	}

	// ������ ���� ��� �޼���
	private void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		
		// �ʼ����� ���̵� ��������
		int majorId = student.getMarjorSubject().getSubjectId();

		
		// ���� �� Ŭ���� �迭 ����. 
		// gradeEvaluation�� 0�� �ε������� �⺻ ���� ��� Ŭ������ �����Ǿ� �ְ�
		// 1�� �ε������� 1�� �ε������� ���� ���� ��� Ŭ������ �����Ǿ� �ִ�.
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MarjorEvaluation()};
		
		for(int i = 0; i < scoreList.size(); i++) {
			Score score = scoreList.get(i);
			
			// ���� ������ ����
			if(score.getSubject().getSubjectId() == subjectId) {
				String grade;
				
				// �ʼ������̶��
				if(score.getStudentId() == majorId) {
					// gradeEvaluation �迭�� 1�� �ε���(MarjorEvaluation() ���� �����Ͽ� getGrade�޼��� ȣ��.)
					grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());
				} else {
				// �Ϲ� �����̶��
					// gradeEvaluation �迭�� 0�� �ε���(BasicEvaluation() ���� �����Ͽ� getGrade�޼��� ȣ��.)
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
