package chapter10.quiz;

public interface Sort {
	// ������ �迭�� �μ��� �޾Ƽ� ������������ �����ϴ� �޼���
	void ascending(int[] arr);
	void descending(int[] arr);
	// ����Ʈ �޼���
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	};
}
