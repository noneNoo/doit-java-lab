package chapter10.quiz;

public class HeapSort implements Sort {

	@Override
	public void ascending(int[] arr) {
		System.out.println("HeapSort ascending");
	}

	@Override
	public void descending(int[] arr) {
		System.out.println("HeapSort descending");
	}

	public void description() {
		Sort.super.description();
		System.out.println("QuickSort?Դϴ?.");
	}
}
