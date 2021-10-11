package lambda;

interface PrintString {
	void showString(String str);
}

// String ���� ����
interface ReturnString {
	String getString(String str);
}


public class TestLambda {
	public static void main(String[] args) {
		// 1. ���ٽ��� �������̽��� ������ �����ϱ�
		PrintString lambdaStr = s -> System.out.println(s);
		//�� ������ ����Ͽ� ���ٽ� ������ ȣ���ϱ�
		lambdaStr.showString("Lambda 1");
		
		// ��ȯ�� �ȴ� 1
		ReturnString returnLambdaString = s -> {
			return s;
		};
		System.out.println(returnLambdaString.getString("�Ŀ�"));
		
		// 2. ���ٽ��� �Ű������� �����ϱ�
		showMyString(lambdaStr);
		
		
		// 3-1. ���ٽ��� ������ ��ȯ�ޱ� 
		PrintString reStr = returnString();
		
		reStr.showString("���ٽ�");
	}
	
	// ����Ŭ���� (ȣ����� ��밡��)
	// �Ű������� ������ ���ٽ� �������̽����� ����
	public static void showMyString (PrintString p) {
		// ������ �������̽��� �޼��带 ���
		p.showString("Lambda 2");
	}
	
	
	// 3-2. ���ٽ��� ��ȯ�ϴ� �޼���
	public static PrintString returnString() {
		return s -> System.out.println(s + ", world!");
	}

}
