package generics;

// 3D 프린터의 재료2
public class Plastic extends Material {
	public void doPrinting() {
		System.out.println("Plastic 재료로 출력합니다.");
	}
	
	// 기본 메서드 오버라이딩
	public String toString() {
		return "재료는 Plastric입니다.";
	}
}
