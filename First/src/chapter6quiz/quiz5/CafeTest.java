package chapter6quiz.quiz5;

public class CafeTest {

	public static void main(String[] args) {
		// ��� �ν��Ͻ� �����
		Person personAnzu = new Person("��Ÿ�� ����", 5000);
		Person personKirari = new Person("��κ��� Ű��"); // ������ 0
		
		// ī�� �ν��Ͻ� �����
		Cafe ankiraCafe = new Cafe("��Ű��");
		Cafe ankimoCafe = new Cafe("��Ű��");
		
		// ī�� �޴� �ν��Ͻ� �����
		CafeMenu ame = new CafeMenu("����", 1500);
		CafeMenu potatochip = new CafeMenu("����Ĩ", 1500);
		CafeMenu americano = new CafeMenu("�Ƹ޸�ī��", 4000);
		CafeMenu latte = new CafeMenu("ī���", 4500);
		
		ankiraCafe.take(personAnzu, ame);
		ankimoCafe.take(personKirari, americano);
		
		personKirari.setMoney(10000);

		ankimoCafe.take(personKirari, americano);
		
		personAnzu.showInfo();
		personKirari.showInfo();
	}

}