package quiz;

public class CalcTest {

	public static void main(String[] args) {
		Calc cal = (num1,num2)-> num1 + num2;
		System.out.println(cal.add(10, 15));
	}

}
