package generics;

// 3D프린터의 재료1
public class Powder extends Material {
	public void doPrinting() {
		System.out.println("Powder 재료로 출력합니다.");
	}
	
	// 기본 메서드 오버라이딩
	public String toString() {
		return "재료는 Powder 입니다.";
	}
}
