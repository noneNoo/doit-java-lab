package array;

import java.util.ArrayList;

public class Alone2 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("소이"));
		students.add(new Student("냐무"));
		students.add(new Student("논노"));
		
		for(Student student:students) {
			student.showInfo();
		}
	}

}
