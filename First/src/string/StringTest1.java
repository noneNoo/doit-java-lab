package string;

public class StringTest1 {

	public static void main(String[] args) {
		
		
		// 1. �ν��Ͻ��� ���� �����ϴ� ���.
		
		// �� ���� �� �ν��Ͻ��� �����ȴ�. �ּҰ� ���� ���� �ٸ���.
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// �ּҰ��� �ٸ��� Ȯ��. false
		System.out.println(str1 == str2);
		// ���ڿ� ���� �����Ƿ� true
		System.out.println(str1.equals(str2));
		
		// ======
		
		// 2. ���Ǯ�� �̸� ����� ���� �����ϴ� ���
		
		// ���α׷� ����� ���ÿ� ���Ǯ�� abc��� ���� ����ȴ�
		// �׷��Ƿ� ���� ���� �ּҰ��� ����Ű�� �ȴ�.
		String str3 = "abc";
		String str4 = "abc";
		
		// ���Ǯ�� ���� �ּҰ� ����Ŵ. true
		System.out.println(str3 == str4);
		// ���ڿ� ���� �����Ƿ� true
		System.out.println(str3.equals(str4));
	}

}
