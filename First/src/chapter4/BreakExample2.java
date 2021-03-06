package chapter4;

public class BreakExample2 {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;

		// 0부터 100까지 숫자를 1씩 늘리며 합을 계산하는데 합이 100을 넘으면 반복문 종료
		// 조건식을 생략하는 대신 break문으로 for문 빠져나옴.
		for(num = 0 ; ; num++) {
			sum += num;
			if(sum >= 100) break;
		}
		System.out.println("num: " + num);
		System.out.println("sum: " + sum);
	}

}
