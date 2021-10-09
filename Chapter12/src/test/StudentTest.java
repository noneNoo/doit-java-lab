package test;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentHashSet set = new StudentHashSet();
		
		
		Student studentSoi = new Student(100, "소이");
		Student studentAnzu = new Student(200, "안즈");
		Student studentKirari = new Student(300, "키라리");
		Student studentChiyoko = new Student(400, "치요코");

		set.addStudent(studentSoi);
		set.addStudent(studentAnzu);
		set.addStudent(studentKirari);
		set.addStudent(studentChiyoko);
		
		set.showAllStudent();
		
		set.removeStudent(100);
		
		set.showAllStudent();
	}

}
