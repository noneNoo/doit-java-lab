package chapter2;

public class Contstant {

	public static void main(String[] args) {
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0; // 사용하기 전 초기화 필수
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		// MAX_NUM = 200; 오류 발생. 상수는 값을 변경할 수 없음 
	}

}
