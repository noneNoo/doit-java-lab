package chapter6quiz.quiz5;

public class Person {
	private int money;
	private String name;
	
	// 생성자1. 이름만 받아올 시 기본 소지금을 0으로
	// this로 다른 생성자를 오버로딩
	public Person(String name) {
		this(name, 0);
	}
	
	// 생성자2. 이름과 돈을 모두 받아올 시
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
		System.out.println(this.name + "님의 소지금은 " + this.money + "원 입니다.");
	}
}
