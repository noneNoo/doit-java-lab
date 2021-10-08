package collection;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		System.out.println(myList);
		
		myList.add(1, "D");
		
		System.out.println(myList);
		
		myList.addFirst("O");
		
		System.out.println(myList);
		
		// 맨 뒤 요소 삭제후 삭제된 요소를 출력
		System.out.println(myList.removeLast());
		
		System.out.println(myList);
	}
}
