package chapter4;

public class Quiz4 {
	public static void main(String[] args) {

		final int HEIGHT = 7;
		int spaceCount = HEIGHT / 2 + 1;
		int starCount = 1;
		
		// 높이만큼 반복된다
		for(int i = 0; i < HEIGHT; i++) {
			// 공백을 찍어낸다
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			// 너비가 최대치에 달할 때까지 *의 개수와 공백을 더한다
			if(i < HEIGHT / 2) {
				starCount += 2;
				spaceCount -= 1;

			// 너비가 최대치일 경우 *의 개수와 공백을 줄인다
			} else {
				starCount -= 2;
				spaceCount += 1;
			};
			// 줄바꿈
			System.out.println();
		}
	}
}
