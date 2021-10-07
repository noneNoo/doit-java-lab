package object;

public class StringEquals {
	public static void main(String[] args) {
		// 1. String Ŭ������ equals() �� �޼���
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// �� �ν��Ͻ��� �ּҰ��� ������ ��
		System.out.println(str1 == str2); // false
		
		// �� �ν��Ͻ��� ���� ��ġ�ϴ��� ��
		System.out.println(str1.equals(str2)); //true
		
		// =======
		// 2. Integer Ŭ������ equals() �� �޼���
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// �� �ν��Ͻ��� �ּҰ��� ������ ��
		System.out.println(i1 == i2);
		// �� �ν��Ͻ��� ���� ��ġ�ϴ��� ��	// false
		System.out.println(i1.equals(i2));	//true
		
		
	}
}