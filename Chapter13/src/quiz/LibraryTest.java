package quiz;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 17000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		bookList.add(new Book("������", 27000));
		
		// ��Ʈ�� ���� �� ���
		// ��� ������ �� (mapToInt�� �� Int���� ��ȯ�Ǿ�� �ϳ���)
		System.out.println("��� å ������ ����: " + bookList.stream().mapToInt(b -> b.getPrice()).sum());
		
		// å ������ 2���� �̻��� ���
		// å�� �̸��� �����Ͽ� ��� ��������
			bookList.stream().filter(b -> b.getPrice() > 20000).
			map(b -> b.getName()).
			sorted().forEach(b -> System.out.println(b));
	}

}
