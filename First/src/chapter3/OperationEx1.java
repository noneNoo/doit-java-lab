package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		// ��� �����ڸ� �̿��Ͽ� ������ ��� ���ϱ�
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;	// ������ �� ����
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3;	// ����� ����
		System.out.println(avgScore);
	}

}
