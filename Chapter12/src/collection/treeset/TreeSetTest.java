package collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	// TreeSet�̶�, �����͸� �߰��ϰ� ����ϸ� ����� �ߺ����� �ʰ� ���ĵǰ� �ϴ� Ŭ����
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("����");
		treeSet.add("Ű��");
		treeSet.add("����");
		
		System.out.println(treeSet);
		for (String name : treeSet) {
			System.out.println(name);
		}
		
	}

}
