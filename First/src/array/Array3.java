package array;

public class Array3 {

	public static void main(String[] args) {
		double data[] = new double[5];
		int size = 0;	// ��ȿ�� ���� ���� �迭�� ���̸� ���� �� ���� ����
		
		// ��ȿ�� ���� ��� ������ size �� 1�� ����
		data[0] = 10.0; size ++;
		data[1] = 20.0; size ++;
		data[2] = 30.0; size ++;
		
		// �迭�� length �޼��� ��� size ������ ���
		for(int i = 0; i < size; i++) {
			System.out.println(data[i]);
		}
		
	}

}
