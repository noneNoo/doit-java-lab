package array;

import java.util.ArrayList;

public class Alone2 {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("����"));
		students.add(new Student("�Ĺ�"));
		students.add(new Student("���"));
		
		for(Student student:students) {
			student.showInfo();
		}
	}

}
