package chapter7quiz;

public class ArrayQuiz {

	public static void main(String[] args) {
		
		int[] arr = new int[5];

		for(int i = 1; i <= 10; i ++) {
			if (i % 2 == 0) {
				arr[(i / 2 - 1)] = i;
			}
		}
		for(int item:arr) {
			System.out.println(item);
		}
	}

}
