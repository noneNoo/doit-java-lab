package interfaceex;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("�Ǹ��ϱ�");
	}

	@Override
	public void buy() {
		System.out.println("�����ϱ�");
		
	}
	

	public void order() {
		System.out.println("�� �Ǹ� �ֹ�");
	}
	
}
