package chapter4;

public class DoWhileExample {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			// 여기에 반복문을 작성
			// 무조건 한번 이상 실행된다.
			sum += num;
			num++;
		} while (num <= 10); // 반복문이 끝나는 조건만 작성. 조건을 마지막에 검사한다.
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");
	}

}
