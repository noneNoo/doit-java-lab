package chapter3;

public class OperationEx1 {

	public static void main(String[] args) {
		// 산술 연산자를 이용하여 총점과 평균 구하기
		int mathScore = 90;
		int engScore = 70;
		int korScore = 100;
		
		int totalScore = mathScore + engScore + korScore;	// 총점의 합 연산
		System.out.println(totalScore);
		
		double avgScore = totalScore / 3;	// 평균점 연산
		System.out.println(avgScore);
	}

}
