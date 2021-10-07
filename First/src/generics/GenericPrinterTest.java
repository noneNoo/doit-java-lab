package generics;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		// Powder������ GenericPrinter Ŭ���� ����
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		// Powder�� �Ű������� ��Ḧ set���ش�.
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();

		System.out.println(powderPrinter);
		powder.doPrinting();
		
		
		// ===
		
		// Plastic������ GenericPrinter Ŭ���� ����
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		// Plastic�� �Ű������� ��Ḧ set ���ش�.
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		
		System.out.println(plasticPrinter);
		plastic.doPrinting();
	}

}
