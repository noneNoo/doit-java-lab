package chapter4;

public class BreakExample1 {
	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		// 0���� 100���� ���ڸ� 1�� �ø��� ���� ����ϴµ� ���� 100�� ������ �ݺ��� ����
		for(num = 0; sum < 100; num++) {
			sum += num;
		}
		System.out.println("num: " + num); // 1ȸ �� ���´�.
		System.out.println("sum: " + sum);
	}
}
