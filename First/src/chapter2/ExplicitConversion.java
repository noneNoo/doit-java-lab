package chapter2;

public class ExplicitConversion {

	public static void main(String[] args) {
		double dNum = 1.2;
		float fNum = 0.9F;
		
		System.out.println(dNum);
		System.out.println(fNum);
		
		int iNum3 = (int)dNum + (int)fNum; // 1.���� ����ȯ�� �� 2.����
		int iNum4 = (int)(dNum + fNum); // 1.�� �Ǽ��� ������ ����ȯ �Ǿ� ������ �� 2. int�� ����ȯ

		System.out.println(iNum3);
		System.out.println(iNum4);
	}

}
