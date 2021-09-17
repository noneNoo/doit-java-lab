package array;

public class Student {
	private static int studentNum = 1000;
	private int studentID;
	private String name;
	
	public Student(String name) {
		studentNum ++;
		studentID = studentNum;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID + ", " + name);
	}
}
