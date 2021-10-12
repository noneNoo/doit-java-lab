package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

// reduce : stream ��� �� ����ڰ� ���� Ŀ������ �� �ִ� ������.

// ������ 1. BinaryOperator �������̽��� ������ Ŭ������ ���� + �����Ͽ� �Ű������� �־��ش�
// ������ 2. �ڵ尡 ������ ��� �Ű������� ���ٽ����� �ٷ� �����Ѵ�


// ������ 1. BinaryOperator �������̽� ����

// Ŭ���� �̸��� ���Ƿ� ������. ���ڿ�<String> ���̸� ���� ���̴�.

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String t, String u) {
		return t.getBytes().length > u.getBytes().length ? t:u;
	}
}

// ���� �� ���ڸ� ã�� ����ϱ�
public class ReduceTest {
	public static void main(String[] args) {
		
		String[] amumal = {"�ȳ��ϼ���~", "Hello", "Good Morning", "���̵������ͻ��̴��÷���°������̴�"};
		String[] amumal2 = {"�ȳ��ϼ���~", "Hello", "�����׵��ϻ���ؾ����׵��ϻ���ؾ����׵��ϻ���ؾ����׵��ϻ������Ÿ�پ����׵��ϻ����", "���̵������ͻ��̴��÷���°������̴�"};

	System.out.println(Arrays.stream(amumal).
				// reduce �Ű������� Ŭ������ ������ get���� �ٷ� �Ѱ���
				reduce(new CompareString()).get());
	
	// �ٷ� ���ٽ�
	System.out.println(Arrays.stream(amumal2).
			//���� �Ű������� ���ٽ� �ֱ�
			reduce(" ", (s1, s2) -> {
				if(s1.getBytes().length > s2.getBytes().length) {
					return s1;
				} else {
					return s2;
				}
			}));
	}

}
