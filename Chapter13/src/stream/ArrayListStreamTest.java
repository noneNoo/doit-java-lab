package stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
	
	

	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		
		
		// ȸ�� �߰�
		sList.add("����");
		sList.add("����");
		sList.add("Ű��");
		
		
		// ��Ʈ������ �迭�� ó��
		Stream<String> stream = sList.stream();
		
		// 1. �ϳ��� ���
		stream.forEach(s -> System.out.println(s));
		
		System.out.println(" === ");
		
		// 2. ��Ʈ�� ���λ���, 
		// �������� ���� 
			// 2-1. ������ �ڷῡ Comparable �������̽� ����
			// 2-2.sorted() �Ű������� �̹� ������ �޼���(Comparator.reverseOrder()���)
		// ��Ҹ� ������ �ϳ��� ���
		
		// sorted�� ����Ϸ��� Comparable�������̽��� �����ؾ� �Ѵ�.
		// �ƴ϶�� Comparator.reverseOrder ���
		sList.stream().sorted(Comparator.reverseOrder()).forEach(s -> System.out.println(s));
	}

}
