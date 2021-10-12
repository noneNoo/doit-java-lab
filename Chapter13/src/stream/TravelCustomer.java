package stream;

public class TravelCustomer {
	private String name;
	private int age;
	private int price;
	
	
	// 생성자
	public TravelCustomer(String name, int age, int price) {
		this.name = name;
		this.age = age;
		this.price = price;
	}
	
	
	// getter & setter
	public void setPrice(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name + ", " + age + "세, " + price + "만원";
	}
	
}
