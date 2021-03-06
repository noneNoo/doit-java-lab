package chapter9.quiz;

import java.util.Random;

public class VocalIdol extends IdolType {
	Random rand = new Random();
	private int vocalPoint = 0;
	private int cutLine;

	
	@Override
	public void training(int count) {
		System.out.println((count + 1) + " 번째 보컬 트레이닝을 실시합니다.");
		// 10 이상 20 이하의 값이 랜덤으로 올라간다
		int upPoint = rand.nextInt(10) + 10;
		vocalPoint += upPoint;
		System.out.println("Vocal + " + upPoint);
		System.out.println("총 Vocal 포인트: " + vocalPoint);
		System.out.println();
	}

	@Override
	public boolean audition(int maxTrainingCount) {
		// 훈련 횟수 * 15포인트 커트라인
		cutLine = maxTrainingCount * 15;
		System.out.println("보컬로 WING 오디션에 참가합니다!");
		System.out.println();
		System.out.println("커트라인: " + cutLine);
		System.out.println("나의 점수: " + vocalPoint);
		System.out.println();
		if(vocalPoint > cutLine) {
			return true;
		} else {
			return false;
		}
	}
}
