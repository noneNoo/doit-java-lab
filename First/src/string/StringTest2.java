package string;

public class StringTest2 {
// ���ڿ� ���� �׽�Ʈ
	public static void main(String[] args) {
		String javaStr = new String("java");
		String androidStr = new String("android");
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �� : " + System.identityHashCode(javaStr));
		
		// �� ���ڿ��� �����Ͽ� �缱��
		javaStr = javaStr.concat(androidStr);
		
		System.out.println(javaStr);
		// ���� ������ ���ڿ� ���� ����Ų��.
		System.out.println("����� ���ڿ� ��: " + System.identityHashCode(javaStr));
		
	}

}
