package collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		// java util���� ���׸� Ŭ���� HashSet�� �ҷ���, �ڷ����� String ���� ������.
		// String type�� HashSet(�����ڷᱸ��)�� �ҷ�����.
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add(new String("����"));
		hashset.add(new String("����"));
		hashset.add(new String("ġ����"));
		hashset.add(new String("����"));
		hashset.add(new String("ġ����"));
		
		System.out.println(hashset);
	}

}
