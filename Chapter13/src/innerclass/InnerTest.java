package innerclass;

// �ܺ� Ŭ���� ����
class OutClass {
	// �ܺ� Ŭ������ private �������
	private int num = 10;
	// �ܺ� Ŭ������ private ���� ����
	private static int sNum = 20;
	
	//���� Ŭ������ �ڷ��� ������ ���� �����Ѵ�
	private InClass inClass;
	
	
	// �ܺ� Ŭ������ ����Ʈ ������
	public OutClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ��!");
		// �ܺ� Ŭ���� ������ �Ǹ� �� �Ŀ��� ���� Ŭ������ ������ �ȴ�.
		inClass = new InClass();
		System.out.println("���� Ŭ���� ���� �Ϸ�!");
	}
	
	// ���� ���� Ŭ���� ����
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 100; // ���� ���� ��� ����
		
		// ���� Ŭ������ '�Ϲ� �޼���'
		void inTest() {
//			num += 10;		// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ����!
			System.out.println("InStaticClass inNum: " + inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNum: " + sInNum + "(���� Ŭ������ ���� ���� ���)");
			System.out.println("OutClass sNum: " + sNum + "(�ܺ� Ŭ������ ���� ���� ��� ����)");
		}
		
		// ���� Ŭ������ '���� �޼���' (���� ������ ��� ����)
		static void sTest() {
//			num += 10;		// �ܺ� Ŭ������ �ν��Ͻ� ������ ����� �� ���� 
//			inNum += 10;	// ���� Ŭ������ �ν��Ͻ� ������ ����� �� ����
			// �ܺο� �ش� ���� Ŭ�������� ������ ���� �����鸸 ��� �����ϴ�.
			System.out.println("OutClass sNum: " + sNum + "(�ܺ� Ŭ������ ���� ���� ��� ����)");
			System.out.println("InStaticClass sInNum: " + sInNum + "(���� Ŭ������ ���� ���� ��� ����)");
		}
	}
	
	// ���� Ŭ���� ����
	class InClass {
		int inNum = 100;
//		static int sNum2 = 200; // �ν��Ͻ� ���� Ŭ������ static(���� ����) ���� �Ұ���

		void inTest() {
			System.out.println("OutClass num: " + num + " (�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println("InClass num: " + sNum + " (�ܺ� Ŭ������ static ����)");
		}

		
//		static void sTest() {} // static�޼��� ���� ���� �Ұ���
	}

	// �ܺ� Ŭ���� �޼��忡�� ���� Ŭ������ �޼��� ȣ��
	public void usingClass() {
		// �����ڿ��� �̹� inClass �ν��Ͻ��� ������ ���¶� ���������� ����� �� �ִ�.
		inClass.inTest();
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("== �ܺ� Ŭ���� �̿��Ͽ� ���� Ŭ���� ��� ȣ�� ==");
		
		// �ٸ� Ŭ�������� �ν��Ͻ� ���� Ŭ���� �����ϱ�
		outClass.usingClass();
		System.out.println();
		
		// �ܺ� Ŭ������ �������� �ʰ� �� ���� static ���� ���� Ŭ������ ���� �� �� ����!
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		
		System.out.println("== ���� ���� Ŭ������ �Ϲ� �޼��� ȣ�� ==");
		sInClass.inTest();	// �Ϲ� �޼���
		
		System.out.println();
		
		System.out.println("== ���� ���� Ŭ������ ���� �޼��� ȣ�� ==");
		sInClass.sTest();	// ���� �޼���
		
	}

}
