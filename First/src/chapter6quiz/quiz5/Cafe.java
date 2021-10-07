package chapter6quiz.quiz5;

public class Cafe {
	String cafeName;
	String menuName;
	int price;
	
	// ���� ����Ǹ� �� �� �� ����...
	// �ܰ��� �մ� ��
	private int money = 0;
	private int passengerCount = 0;
	
	
	// ī�� ������ �����ε�
	Cafe(String name) {
		this(name,0);
	}
	
	Cafe(String cafeName, int money) {
		this.cafeName = cafeName;
		this.money = money;
	}
	
	// �Ǹ� �޼���
	public void take(Person person, CafeMenu menu) {
		this.take(person, menu, 1);
	}
	public void take(Person person, CafeMenu menu, int num) {
		// �⺻ ��Ʈ ���
		System.out.println("�ȳ��ϼ���! "+ person.getname() + "��. '" + cafeName + "ī��' �Դϴ�.");
 		System.out.println(menu.name + "�� " + num + "�� ������ " + menu.price + "�� �Դϴ�.");
 		// ���� ���� ���� ��
		if(person.getMoney() < menu.price) {
	 		System.out.println("�մ��� �������� �����մϴ�. ������ �����Ͽ����ϴ�.");
		}else {
			person.setMoney(person.getMoney() - (menu.price * num));
			this.money += menu.price;
			System.out.println(menu.price + "�� �����Ͽ����ϴ�. ���� �ܾ� " + person.getMoney());
		}
 		System.out.println("�ȳ��� ���ʽÿ�!");
 		System.out.println();
	}
	
	public void showInfo() {
		System.out.println(cafeName + "�� �湮��: " + passengerCount + "��, ����: " + money);
	}
}