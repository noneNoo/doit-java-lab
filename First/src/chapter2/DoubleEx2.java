package chapter2;

public class DoubleEx2 {
	// 부동 소수점 방식의 오류
	// 부동 소수점 값을 연산하면 약간의 오차가 발생한다.
	// 하지만 약간의 오차를 감수하더라도 더 런ㅂ은 범위의 실수 값을 표현하기 위해 부동 소수점 방식을 사용한다.
	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i = 0; i < 10000; i++) {
			dnum = dnum + 0.1;
			System.out.println(dnum);
		}
		// 1001이 아니라 오차값까지 출력된다.
		System.out.println(dnum);
	}
}
