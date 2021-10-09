package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	// TreeSet이란, 데이터를 추가하고 출력하면 결과가 중복되지 않게 정렬되게 하는 클래스
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("소이");
		treeSet.add("키라리");
		treeSet.add("안즈");
		
		System.out.println(treeSet);
		for (String name : treeSet) {
			System.out.println(name);
		}
		
	}

}
