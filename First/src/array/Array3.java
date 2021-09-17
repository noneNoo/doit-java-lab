package array;

public class Array3 {

	public static void main(String[] args) {
		double data[] = new double[5];
		int size = 0;	// 유효한 값을 가진 배열의 길이를 담을 새 변수 생성
		
		// 유효한 값이 담길 때마다 size 가 1씩 증가
		data[0] = 10.0; size ++;
		data[1] = 20.0; size ++;
		data[2] = 30.0; size ++;
		
		// 배열의 length 메서드 대신 size 변수를 사용
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
		
	}

}
