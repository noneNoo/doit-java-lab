package generics;

public class GenericPrinterTest2 {

	public static void main(String[] args) {
		
		// === Powder Test
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		
		// getMaterial�� ��Ḧ �ҷ��� �� ����� doPrinting �޼��带 ������� �ʰ�
		// material�� Ȯ��޾ƿ� �޼��嵵 �� ȣ���� �ȴ�.
		
		powderPrinter.printing();
		
		
		// === Plastic Test
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		
		plasticPrinter.setMaterial(new Plastic());
		
		plasticPrinter.printing();
		
		// === ������ �ڷ��� Test �۵� �ȵ�!
		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Wataer>();
	}

}
