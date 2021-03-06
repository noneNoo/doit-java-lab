package object;

public class StringEquals {
	public static void main(String[] args) {
		// 1. String 클래스의 equals() 비교 메서드
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		// 두 인스턴스의 주소값이 같은지 비교
		System.out.println(str1 == str2); // false
		
		// 두 인스턴스의 값이 일치하는지 비교
		System.out.println(str1.equals(str2)); //true
		
		// =======
		// 2. Integer 클래스의 equals() 비교 메서드
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		// 두 인스턴스의 주소값이 같은지 비교
		System.out.println(i1 == i2);
		// 두 인스턴스의 값이 일치하는지 비교	// false
		System.out.println(i1.equals(i2));	//true
		
		
	}
}
