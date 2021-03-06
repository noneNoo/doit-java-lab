package object;

public class HashCodeTest {

	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");

		// equals의 결과값이 true인 경우 동일한 hashcode반환
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);

		// equals의 결과값이 true인 경우 동일한 hashcode반환
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
	}

}
