package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// add
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// remove (들어온 순서대로)
	
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("큐가 비었습니다.");
			return null;
		}
		
		// 지워지는 값 리턴과 동시에 첫번째 큐 remove
		return (arrayQueue.remove(0));
	}
}


// 큐방식 (FIFO)
public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		// A B C 형태로 들어옴
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		// A B C 형태로 나감
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		// 큐가 비었을 시 오류

		System.out.println(queue.deQueue());
		
	}

}
