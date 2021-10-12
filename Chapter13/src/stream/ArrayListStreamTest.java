package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		
		// 회원 추가
		sList.add("소이");
		sList.add("안즈");
		sList.add("키라리");
		
		
		// 스트림으로 배열을 처리
		Stream<String> stream = sList.stream();
		
		// 1. 하나씩 출력
		stream.forEach(s -> System.out.println(s));
		
		System.out.println(" === ");
		
		// 2. 스트림 새로생성, 
		// 내림차순 정렬 
			// 2-1. 정렬할 자료에 Comparable 인터페이스 구현
			// 2-2.sorted() 매개변수에 이미 구현된 메서드(Comparator.reverseOrder()사용)
		// 요소를 꺼내서 하나씩 출력
		
		// sorted를 사용하려면 Comparable인터페이스를 구현해야 한다.
		// 아니라면 Comparator.reverseOrder 사용
		sList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
	}

}
