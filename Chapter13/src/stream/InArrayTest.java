package stream;

// Arrays 가져오기
import java.util.Arrays;

public class InArrayTest {

	// stream은 배열(집합)을 처리하는 기능이며
		// 1. 중간연산 (조건에 맞는 자료를 추출)
		// 2. 최종연산 (스트림의 자료를 소모하면서 연산을 수행한다)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		// Arrays의 stream을 이용하여 최종연산 sum
		int sumVal = Arrays.stream(arr).sum();

		// 최종연산 count
		// Count는 long타입을 반환하기 때문에 형변환이 필요하다. 
		int countVal = (int) Arrays.stream(arr).count();
		System.out.println(sumVal);
		System.out.println(countVal);
		
		
	}

}
