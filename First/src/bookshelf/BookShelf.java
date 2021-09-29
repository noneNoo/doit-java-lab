package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	// 배열에 요소 추가
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		// 맨 처음 요소를 삭제하고 return한다.
		return shelf.remove(0);
	}

	@Override
	public int getSize() {
		return getCount();
	}

}
