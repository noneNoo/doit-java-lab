package array;

public class TwoDimension2 {
	public static void main(String[] args) {
		int[][] arr = new int[2][3];
		
		// 행길이 (arr.length)
		for(int i = 0; i < arr.length; i++) {
			// 열길이 (arr[i].length)
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		// 행길이
		System.out.println(arr.length);
		
		//열길이
		System.out.println(arr[0].length);
		
	}
}
