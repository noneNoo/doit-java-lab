package grade;


// ���� ���� ��� �����Ͻ� (SABŸ��.)
public class MarjorEvaluation implements GradeEvaluation {

	String grade;
	
	@Override
	public String getGrade(int point) {
		if(point <= 100 && point >= 95) {
			grade = "S";
		} else if(point >= 90) {
//			grade = "A";
			// �̷��� �ϴ� ������ ����? 
			grade = new String("A");
		} else if(point >= 80) {
			grade = "B";
		} else if(point >= 70) {
			grade = "C";
		} else if(point >= 55) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}

}
