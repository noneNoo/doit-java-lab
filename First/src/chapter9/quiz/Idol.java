package chapter9.quiz;

public class Idol {
	public String name;
	private IdolType type;
	// 프로듀스 결과 저장
	private boolean isPassed;
	
	Idol(String name, IdolType type) {
		this.name = name;
		this.type = type;
	}
	
	public void produce(int count) {
		System.out.println(name + ": 열심히 해보자!");
		
		this.isPassed = type.go(count);
		
		if(isPassed) {
			System.out.println("합격입니다.");
			System.out.println(name + ": 얏따!");
		} else {
			System.out.println("탈락입니다.");
			System.out.println(name + ": 아우우...");
		}
	}

}
