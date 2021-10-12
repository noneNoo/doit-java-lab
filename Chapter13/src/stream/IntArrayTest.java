package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// 배열의 값들을 모조리 더하기
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		
		// 배열의 요소 개수를 반환 (count의 반환값이 long 이므로 int로 변환)
		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);
	}

}
