package chapter6quiz.quiz5;

public class Person {
	private int money;
	private String name;
	
	// ������1. �̸��� �޾ƿ� �� �⺻ �������� 0����
	// this�� �ٸ� �����ڸ� �����ε�
	public Person(String name) {
		this(name, 0);
	}
	
	// ������2. �̸��� ���� ��� �޾ƿ� ��
	public Person(String name, int money) {
		this.money = money;
		this.name = name;
	}
	
	public String getname() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	
	public void showInfo() {
		System.out.println(this.name + "���� �������� " + this.money + "�� �Դϴ�.");
	}
}