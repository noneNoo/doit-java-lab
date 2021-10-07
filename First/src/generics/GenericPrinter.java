package generics;

// Generic 클래스 선언
// 엉뚱한 자료형을 재료로 받아오는 것을 방지하기 위해 사용할 수 있는 자료형에 제약을 두었다.
// Material 클래스를 상속받지 않은 T 자료형을 불러올 경우 오류가 발생!
// 이렇게 선언하면 상속받은 Material 클래스의 메서드도 이용 가능하다! 
public class GenericPrinter<T extends Material> {
	
	// T 자료형으로 재료 선언
	private T material;
	
	
	// 받아온 T자료형 변수를 메서드에 활용한 '제네릭 메서드'
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	// extends해온 상위 클래스 Material의 메서드 호출 가능
	public void printing() {
		material.doPrinting();
	}
}
