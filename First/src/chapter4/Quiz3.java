package chapter4;

public class Quiz3 {

	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램
		// break문 사용
		int times = 1;
		
		for(int dan = 1; dan <= 9; dan++) {
			for(times = 1; times <= 9 ; times++) {
				System.out.println(dan + "*" + times + "=" + dan * times);

				if(times >= dan) break;
			}
		}
	}

}
