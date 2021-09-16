package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		// Ŭ������ static getter �޼��带 ȣ���Ͽ� �������� 2���� ���� ����
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		// �� ���������� ���� �ּҸ� ����Ű���� Ȯ���Ѵ�. 
		System.out.println(myCompany1);
		System.out.println(myCompany2);

		// true ���
		System.out.println(myCompany1 == myCompany2);
	}

}
