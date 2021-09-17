package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		double data[] = new double[5];	// double형으로 길이 5인 배열 선언
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//data[3]~data[4] 는 선언만 하여 0으로 초기화만 된 상태.
		
		for(int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}

}
