package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		// Powder형으로 GenericPrinter 클래스 생성
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		// Powder를 매개변수로 재료를 set해준다.
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();

		System.out.println(powderPrinter);
		powder.doPrinting();
		
		
		// ===
		
		// Plastic형으로 GenericPrinter 클래스 생성
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		// Plastic을 매개변수로 재료를 set 해준다.
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		
		System.out.println(plasticPrinter);
		plastic.doPrinting();
	}

}
