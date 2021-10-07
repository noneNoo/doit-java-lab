package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		
		// === Powder Test
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		
		// getMaterial로 재료를 불러와 그 재료의 doPrinting 메서드를 사용하지 않고
		// material이 확장받아온 메서드도 잘 호출이 된다.
		
		powderPrinter.printing();
		
		
		// === Plastic Test
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		
		plasticPrinter.printing();
		
		// === 엉뚱한 자료형 Test 작동 안됨!
		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Wataer>();
	}

}
