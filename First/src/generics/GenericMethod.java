package generics;

public class GenericMethod {

	// ���ʸ� �޼���
	// �� ��(Point �ڷ��� �ν��Ͻ�)�� �Ű������� �޾� �簢���� ���̸� ����ϴ� �޼���
	public static <T, V> double makeRectangle(Point<T,V> p1, Point<T,V> p2) {

		double left = ((Number)p1.getX()).doubleValue();
		double right = ((Number)p2.getX()).doubleValue();
		double top = ((Number) p1.getY()).doubleValue();
		double bottom = ((Number) p2.getY()).doubleValue();
		
		double width = right - left;
		double height = bottom - top;
		
		return width * height;
	}
	
	public static void main(String[] args) {
		// ���ʸ� �޼��忡 �־��� �Ű����� ����Ʈ 2���� �����Ѵ�.
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		// �ν��Ͻ��� ���̾Ƹ�� �����ڸ� ����ϰ� �ڷ����� �������� �ʾƵ� �����Ϸ��� �տ� ����� �ڷ����� ���� ������ �� �ִ�.
		Point<Integer, Double> p2 = new Point<>(10,10.0);
		
		// ���� ����
		double rect = makeRectangle(p1, p2);
		
		System.out.println("�� ������ ������� �簢���� ���̴�" + rect + " �Դϴ�.");
	}

}