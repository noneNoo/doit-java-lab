package hiding.test2;
import chapter5.Student;
 

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student();
		
		studentLee.setStudentName("이상원");
		studentLee.address = "서울 양천구";
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee.address);
	}

}
