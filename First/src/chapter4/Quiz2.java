package chapter4;

public class Quiz2 {

	public static void main(String[] args) {
		// 구구단을 짝수단만 출력하는 프로그램을 만들어보자
		// continue문을 사용
		
		for(int dan = 1; dan <= 9; dan++) {
			// 짝수단에서 아래의 반복문 스킵
			if(dan % 2 != 0) {
				continue;
			}
			// 구구단 출력
			for(int times = 1; times <= 9; times ++) {
				System.out.println(dan + "*" + times + "=" + dan * times);
			}
			//단이 끝나면 줄바꿈
			System.out.println();
		}

	}

}
