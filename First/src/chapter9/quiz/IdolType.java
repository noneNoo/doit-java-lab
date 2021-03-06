package chapter9.quiz;

public abstract class IdolType {
	
	public void rest() {
		System.out.println("마지막 턴이 되어 아이돌이 휴식합니다.");
		System.out.println();
	}
	
	public abstract void training(int count);
	public abstract boolean audition(int count);
	public boolean go(int count) {
		
		System.out.println("총 " + count + " 회 트레이닝하여 WING 오디션에 도전해봅시다!");
		System.out.println();
		for(int i = 0; i < count; i++) {
			training(i);
		}
		rest();
		return audition(count);
		
	}

	
}
