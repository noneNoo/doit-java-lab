package chapter9.quiz;

import java.util.Random;

public class DanceIdol extends IdolType {
	Random rand = new Random();
	private int dancePoint = 0;
	private int cutLine;

	
	@Override
	public void training(int count) {
		System.out.println((count + 1) + " ��° ���� Ʈ���̴��� �ǽ��մϴ�.");
		// 10 �̻� 20 ������ ���� �������� �ö󰣴�
		int upPoint = rand.nextInt(10) + 10;
		dancePoint += upPoint;
		System.out.println("Dance + " + upPoint);
		System.out.println("�� Dance ����Ʈ: " + dancePoint);
		System.out.println();
	}

	@Override
	public boolean audition(int maxTrainingCount) {
		// �Ʒ� Ƚ�� * 15����Ʈ ĿƮ����
		cutLine = maxTrainingCount * 15;
		System.out.println("������ WING ����ǿ� �����մϴ�!");
		System.out.println();
		System.out.println("ĿƮ����: " + cutLine);
		System.out.println("���� ����: " + dancePoint);
		System.out.println();
		if(dancePoint > cutLine) {
			return true;
		} else {
			return false;
		}
	}
}