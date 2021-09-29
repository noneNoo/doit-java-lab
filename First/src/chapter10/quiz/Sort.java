package chapter10.quiz;

public interface Sort {
	// 정수형 배열을 인수로 받아서 오름차순으로 정렬하는 메서드
	void ascending(int[] arr);
	void descending(int[] arr);
	// 디폴트 메서드
	default void description() {
		System.out.println("숫자를 정렬하는 알고리즘입니다.");
	};
}
