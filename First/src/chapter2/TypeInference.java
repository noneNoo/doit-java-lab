package chapter2;

public class TypeInference {

	public static void main(String[] args) {
		var i = 10;			// int i = 10���� ������ ��.
		var j = 10.0;		// double j = 10.0���� ������ ��.
		var str = "Hello";	// String str = "Hello"�� ������ ��.
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test";		// �ٸ� ���ڿ� ���� ����
		
		System.out.println(str);
		
		// str = 3; �̹� String������ ������ �Ǿ��� ������ ������ ������ ���� �߻�
	}

}
