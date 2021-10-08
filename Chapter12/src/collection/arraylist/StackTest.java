package collection.arraylist;

import java.util.ArrayList;

class MyStack {
	private ArrayList<String> arrayStack = new ArrayList<String>();
	
	// push (맨 위에 자료 쌓기)
	public void push(String data) {
		arrayStack.add(data);
	}
	
	// pop (맨 위의 자료부터 제거)
	public String pop() {
		int len = arrayStack.size();
		
		if (len == 0) {
			System.out.println("스택이 비었습니다.");
			return null;
		}
		
		// 지워진 값을 반환하며 지우기까지 함
		return (arrayStack.remove(len - 1));
	}
}

public class StackTest {
	
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");

		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
