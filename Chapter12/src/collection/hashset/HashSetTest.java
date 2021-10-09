package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// java util에서 제네릭 클래스 HashSet을 불러와, 자료형을 String 으로 지정함.
		// String type의 HashSet(집합자료구조)이 불러와짐.
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add(new String("소이"));
		hashset.add(new String("안즈"));
		hashset.add(new String("치요코"));
		hashset.add(new String("린제"));
		hashset.add(new String("치요코"));
		
		System.out.println(hashset);
	}

}
