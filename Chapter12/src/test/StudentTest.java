package test;

public class StudentTest {

	public static void main(String[] args) {
		
		StudentHashSet set = new StudentHashSet();
		
		
		Student studentSoi = new Student(100, "����");
		Student studentAnzu = new Student(200, "����");
		Student studentKirari = new Student(300, "Ű��");
		Student studentChiyoko = new Student(400, "ġ����");

		set.addStudent(studentSoi);
		set.addStudent(studentAnzu);
		set.addStudent(studentKirari);
		set.addStudent(studentChiyoko);
		
		set.showAllStudent();
		
		set.removeStudent(100);
		
		set.showAllStudent();
	}

}
