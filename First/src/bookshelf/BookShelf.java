package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	// �迭�� ��� �߰�
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// �� ó�� ��Ҹ� �����ϰ� return�Ѵ�.
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
