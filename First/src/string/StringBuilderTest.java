package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("java");
		System.out.println("javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		
		// ���� ������ StringBuilder Ŭ����
		// ���ڷ� String Object�� �޾ƿ�
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		// buffer�� ���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programing is fun!");
		
		// ���� �� �޸� �ּ� Ȯ��. �ٲ��� �ʾ���
		System.out.println("���� �� buffer �޸� �ּ�: " + System.identityHashCode(buffer));
		
		// String class�� ��ȯ�Ͽ� ����
		javaStr = buffer.toString();
		
		System.out.println("���� ������� javaStr ���ڿ� �ּ�: " + System.identityHashCode(javaStr));
		
		
	}

}
