package chapter4;

public class Quiz3 {

	public static void main(String[] args) {
		// �������� �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϴ� ���α׷�
		// break�� ���
		int times = 1;
		
		for(int dan = 1; dan <= 9; dan++) {
			for(times = 1; times <= 9 ; times++) {
				System.out.println(dan + "*" + times + "=" + dan * times);

				if(times >= dan) break;
			}
		}
	}

}