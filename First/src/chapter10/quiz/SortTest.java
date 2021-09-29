package chapter10.quiz;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("B: BubbleSort");
		System.out.println("H: HeapSort");
		System.out.println("Q: QuickSort");
		
		int ch = System.in.read();
		Sort sort = null;
		
		switch (ch) {
		case 'B' : case 'b' :
			sort = new BubbleSort();
			break;
		case 'H' : case 'h' :
			sort = new HeapSort();
			break;
		case 'Q' : case 'q' :
			sort = new QuickSort();
			break;
		default:
			System.out.println("�������� �ʴ� ����Դϴ�.");
		}
		
		// ���� ��İ� ��� ���� �޼��尡 ȣ��
		int[] arr = new int[10];
		sort.ascending(arr);
		sort.descending(arr);
		sort.description();
	}
	
}
