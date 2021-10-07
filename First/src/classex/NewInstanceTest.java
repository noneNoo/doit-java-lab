package classex;

public class NewInstanceTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person p1 = new Person();
		System.out.println(p1);
		
		Class pClass = Class.forName("classex.Person");
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p2);
	}

}
