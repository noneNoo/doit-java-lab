package chapter9.finalex;

public class Constant {

	int level = 0;
	final int MAX_LEVEL = 100;
	
	public static void main(String[] args) {
		Constant constant = new Constant();
		
		System.out.println(constant.level);
		constant.level = 10;
//		constant.MAX_LEVEL = 200;  ���� �߻�. ����� ���� �Ұ���
		System.out.println(constant.level);
		System.out.println(constant.MAX_LEVEL);
	}

}
