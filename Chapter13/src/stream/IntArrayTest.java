package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		
		// �迭�� ������ ������ ���ϱ�
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		
		// �迭�� ��� ������ ��ȯ (count�� ��ȯ���� long �̹Ƿ� int�� ��ȯ)
		int count = (int) Arrays.stream(arr).count();
		System.out.println(count);
	}

}
