package bookshelf;

public interface Queue {
	
	// 입력되는 요소값을 배열의 맨 뒤에 저장하고, (enQueue)
	// 맨 앞의 있는 요소값을 제거하고 그 값을 반환 (deQueue)
	// 
	
	
	void enQueue(String title);	// 배열의 맨 마지막에 추가
	String deQueue();			// 맨 처음 항목 반환
	int getSize();				// 현재 Queue에 있는 개수 반환
}
