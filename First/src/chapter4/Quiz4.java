package chapter4;

public class Quiz4 {
	public static void main(String[] args) {

		final int HEIGHT = 7;
		int spaceCount = HEIGHT / 2 + 1;
		int starCount = 1;
		
		// ���̸�ŭ �ݺ��ȴ�
		for(int i = 0; i < HEIGHT; i++) {
			// ������ ����
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			for(int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for(int j = 0; j < spaceCount; j++) {
				System.out.print(' ');
			}
			
			// �ʺ� �ִ�ġ�� ���� ������ *�� ������ ������ ���Ѵ�
			if(i < HEIGHT / 2) {
				starCount += 2;
				spaceCount -= 1;

			// �ʺ� �ִ�ġ�� ��� *�� ������ ������ ���δ�
			} else {
				starCount -= 2;
				spaceCount += 1;
			};
			// �ٹٲ�
			System.out.println();
		}
	}
}