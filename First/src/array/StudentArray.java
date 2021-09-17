package array;

public class StudentArray {

	public static void main(String[] args) {
		Student[] students = new Student[3];

		students[0] = new Student("박소이");
		students[1] = new Student("논노");
		students[2] = new Student("냐무");
		
		for(int i = 0; i < students.length; i++) {
			students[i].showInfo();
		}
	}

}
