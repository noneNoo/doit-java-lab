package bookshelf;

import java.util.ArrayList;

// Shelf (����) Ŭ����
public class Shelf {
	// protected ����������: ��Ű�� ���� Ŭ����, �ش� Ŭ������ ��ӹ��� �ܺ� Ŭ���������� ��� �����ϴ�.
	// �� ArrayList�� ���� �ص� ����
	// ���⿡ �ڷḦ ������� ������ ���̴�.
	protected ArrayList<String> shelf;
	
	// ����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������.
	public Shelf() {
		shelf = new ArrayList<String>();
	}
	
	// ArrayList ��ȯ�ϴ� getter
	public ArrayList<String> getShelf() {
		return shelf;
	}
	
	public int getCount() {
		return shelf.size();
	}
}
