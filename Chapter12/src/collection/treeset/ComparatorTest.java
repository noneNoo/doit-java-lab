package collection.treeset;

// Comparator 인터페이스 사용하기
// Comparable 인터페이스를 사용할 수 없을 때
	// ex ) String 클래스에서 이미 comparable 인터페이스를 구현하고 Comparable 인터페이스에서도 오름차순 정렬을 구현하고 있는데
	// 정렬 방식을 내림차순으로 바꾸고 싶을 경우... 이게 뭔솔ㅋㅋ...

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1; // 내림차수정렬은 음수로 만들어야 하기 때문에 -1 곱함
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {

		// TreeSet 생성자의 매개변수로 정렬방식을 지정한다
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		// 아래처럼 매개변수를 넣지 않으면 오름차순
		Set<String> set2 = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		set.add("fff");
		set.add("eee");

		set2.add("aaa");
		set2.add("ccc");
		set2.add("bbb");
		set2.add("fff");
		set2.add("eee");
		
		System.out.println(set);
		System.out.println(set2);
	}
	
	
}
