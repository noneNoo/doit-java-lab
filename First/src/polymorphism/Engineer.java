package polymorphism;


public class Engineer extends Employee {
	
	public Engineer() {
		super("¤·¤·");
	}


	private String skillset;
	public String getSkillSet() {
		return skillset;
	}
	
	public void setSkillSet(String skillset) {
		this.skillset = skillset;
	}
}


class Employee {
	public String name;
	public String grade;
	
	public Employee(String name) {
		this.name = name;
	}
	
	
}
