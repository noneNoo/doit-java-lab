package chapter4;

public class Quiz2 {

	public static void main(String[] args) {
		// �������� ¦���ܸ� ����ϴ� ���α׷��� ������
		// continue���� ���
		
		for(int dan = 1; dan <= 9; dan++) {
			// ¦���ܿ��� �Ʒ��� �ݺ��� ��ŵ
			if(dan % 2 != 0) {
				continue;
			}
			// ������ ���
			for(int times = 1; times <= 9; times ++) {
				System.out.println(dan + "*" + times + "=" + dan * times);
			}
			//���� ������ �ٹٲ�
			System.out.println();
		}

	}

}
