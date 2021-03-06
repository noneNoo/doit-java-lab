package chapter9.quiz;

import java.util.Random;

public class VisualIdol extends IdolType {
	Random rand = new Random();
	private int visualPoint = 0;
	private int cutLine;

	
	@Override
	public void training(int count) {
		System.out.println((count + 1) + " 번째 비주얼 트레이닝을 실시합니다.");
		// 10 이상 20 이하의 값이 랜덤으로 올라간다
		int upPoint = rand.nextInt(10) + 10;
		visualPoint += upPoint;
		System.out.println("Visual + " + upPoint);
		System.out.println("총 Visual 포인트: " + visualPoint);
		System.out.println();
	}

	@Override
	public boolean audition(int maxTrainingCount) {
		// 훈련 횟수 * 15포인트 커트라인
		cutLine = maxTrainingCount * 15;
		System.out.println("비주얼로 WING 오디션에 참가합니다!");
		System.out.println();
		System.out.println("커트라인: " + cutLine);
		System.out.println("나의 점수: " + visualPoint);
		System.out.println();
		if(visualPoint > cutLine) {
			return true;
		} else {
			return false;
		}
	}
}
