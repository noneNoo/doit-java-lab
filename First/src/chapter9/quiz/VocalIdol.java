package chapter9.quiz;

import java.util.Random;

public class VocalIdol extends IdolType {
	Random rand = new Random();
	private int vocalPoint = 0;
	private int cutLine;

	
	@Override
	public void training(int count) {
		System.out.println((count + 1) + " ��° ���� Ʈ���̴��� �ǽ��մϴ�.");
		// 10 �̻� 20 ������ ���� �������� �ö󰣴�
		int upPoint = rand.nextInt(10) + 10;
		vocalPoint += upPoint;
		System.out.println("Vocal + " + upPoint);
		System.out.println("�� Vocal ����Ʈ: " + vocalPoint);
		System.out.println();
	}

	@Override
	public boolean audition(int maxTrainingCount) {
		// �Ʒ� Ƚ�� * 15����Ʈ ĿƮ����
		cutLine = maxTrainingCount * 15;
		System.out.println("���÷� WING ����ǿ� �����մϴ�!");
		System.out.println();
		System.out.println("ĿƮ����: " + cutLine);
		System.out.println("���� ����: " + vocalPoint);
		System.out.println();
		if(vocalPoint > cutLine) {
			return true;
		} else {
			return false;
		}
	}
}