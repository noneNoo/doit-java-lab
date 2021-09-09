package chapter4;

public class BreakExample1 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		// 0부터 100까지 숫자를 1씩 늘리며 합을 계산하는데 합이 100을 넘으면 반복문 종료
		for(num = 0; sum < 100; num++) {
			sum += num;
		}
		System.out.println("num: " + num); // 1회 더 나온다.
		System.out.println("sum: " + sum);
	}
}
