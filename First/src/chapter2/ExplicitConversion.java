package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum = 1.2;
		float fNum = 0.9F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		int iNum3 = (int)dNum + (int)fNum; // 1.각각 형변환한 후 2.연산
		int iNum4 = (int)(dNum + fNum); // 1.두 실수가 묵시적 형변환 되어 연산한 후 2. int로 형변환

		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
