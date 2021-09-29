package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {
		Queue selfQueue = new BookShelf();

		selfQueue.enQueue("아이돌마스터 신데렐라 걸즈");
		selfQueue.enQueue("아이돌마스터 밀리언 라이브");
		selfQueue.enQueue("아이돌마스터 샤이니 컬러즈");

		System.out.println(selfQueue.deQueue());
		System.out.println(selfQueue.deQueue());
		System.out.println(selfQueue.deQueue());
	}

}
