package stream;

// Arrays ��������
import java.util.Arrays;

public class InArrayTest {

	// stream�� �迭(����)�� ó���ϴ� ����̸�
		// 1. �߰����� (���ǿ� �´� �ڷḦ ����)
		// 2. �������� (��Ʈ���� �ڷḦ �Ҹ��ϸ鼭 ������ �����Ѵ�)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		
		// Arrays�� stream�� �̿��Ͽ� �������� sum
		int sumVal = Arrays.stream(arr).sum();

		// �������� count
		// Count�� longŸ���� ��ȯ�ϱ� ������ ����ȯ�� �ʿ��ϴ�. 
		int countVal = (int) Arrays.stream(arr).count();
		System.out.println(sumVal);
		System.out.println(countVal);
		
		
	}

}
