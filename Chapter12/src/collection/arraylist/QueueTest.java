package collection.arraylist;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<String>();
	
	// add
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	// remove (���� �������)
	
	public String deQueue() {
		int len = arrayQueue.size();
		if (len == 0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		
		// �������� �� ���ϰ� ���ÿ� ù��° ť remove
		return (arrayQueue.remove(0));
	}
}


// ť��� (FIFO)
public class QueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		// A B C ���·� ����
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		// A B C ���·� ����
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
		// ť�� ����� �� ����

		System.out.println(queue.deQueue());
		
	}

}
