package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue selfQueue = new BookShelf();

		selfQueue.enQueue("���̵������� �ŵ����� ����");
		selfQueue.enQueue("���̵������� �и��� ���̺�");
		selfQueue.enQueue("���̵������� ���̴� �÷���");

		System.out.println(selfQueue.deQueue());
		System.out.println(selfQueue.deQueue());
		System.out.println(selfQueue.deQueue());
	}

}
