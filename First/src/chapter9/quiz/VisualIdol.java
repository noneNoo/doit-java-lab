package chapter9.quiz;

import java.util.Random;

public class VisualIdol extends IdolType {
	Random rand = new Random();
	private int visualPoint = 0;
	private int cutLine;

	
	@Override
	public void training(int count) {
		System.out.println((count + 1) + " ��° ���־� Ʈ���̴��� �ǽ��մϴ�.");
		// 10 �̻� 20 ������ ���� �������� �ö󰣴�
		int upPoint = rand.nextInt(10) + 10;
		visualPoint += upPoint;
		System.out.println("Visual + " + upPoint);
		System.out.println("�� Visual ����Ʈ: " + visualPoint);
		System.out.println();
	}

	@Override
	public boolean audition(int maxTrainingCount) {
		// �Ʒ� Ƚ�� * 15����Ʈ ĿƮ����
		cutLine = maxTrainingCount * 15;
		System.out.println("���־�� WING ����ǿ� �����մϴ�!");
		System.out.println();
		System.out.println("ĿƮ����: " + cutLine);
		System.out.println("���� ����: " + visualPoint);
		System.out.println();
		if(visualPoint > cutLine) {
			return true;
		} else {
			return false;
		}
	}
}