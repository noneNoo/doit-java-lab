package chapter7quiz;

public class Dog {
	private String name;
	private String type;
	
	// ??????
	public Dog(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	public String getType() {
		return type;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String showDogInfo() {
		return name + ", " + type;
	}
}
