package collection.treeset;

// Comparator �������̽� ����ϱ�
// Comparable �������̽��� ����� �� ���� ��
	// ex ) String Ŭ�������� �̹� comparable �������̽��� �����ϰ� Comparable �������̽������� �������� ������ �����ϰ� �ִµ�
	// ���� ����� ������������ �ٲٰ� ���� ���... �̰� ���֤���...

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;


class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return (s1.compareTo(s2)) * -1; // �������������� ������ ������ �ϱ� ������ -1 ����
	}
	
}

public class ComparatorTest {
	public static void main(String[] args) {

		// TreeSet �������� �Ű������� ���Ĺ���� �����Ѵ�
		Set<String> set = new TreeSet<String>(new MyCompare());
		
		// �Ʒ�ó�� �Ű������� ���� ������ ��������
		Set<String> set2 = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ccc");
		set.add("bbb");
		set.add("fff");
		set.add("eee");

		set2.add("aaa");
		set2.add("ccc");
		set2.add("bbb");
		set2.add("fff");
		set2.add("eee");
		
		System.out.println(set);
		System.out.println(set2);
	}
	
	
}
