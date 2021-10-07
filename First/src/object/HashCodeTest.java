package object;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		// equals�� ������� true�� ��� ������ hashcode��ȯ
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		// equals�� ������� true�� ��� ������ hashcode��ȯ
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}