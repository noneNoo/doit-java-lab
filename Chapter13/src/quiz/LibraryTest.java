package quiz;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("자바", 25000));
		bookList.add(new Book("파이썬", 17000));
		bookList.add(new Book("안드로이드", 30000));
		bookList.add(new Book("가나다", 27000));
		
		// 스트림 생성 후 출력
		// 모든 가격의 합 (mapToInt로 꼭 Int형이 반환되어야 하나바)
		System.out.println("모든 책 가격의 합은: " + bookList.stream().mapToInt(b -> b.getPrice()).sum());
		
		// 책 가격이 2만원 이상인 경우
		// 책의 이름을 정렬하여 출력 ㄱㄴㄷ순
			bookList.stream().filter(b -> b.getPrice() > 20000).
			map(b -> b.getName()).
			sorted().forEach(b -> System.out.println(b));
	}

}
