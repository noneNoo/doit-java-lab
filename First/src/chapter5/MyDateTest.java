package chapter5;

public class MyDateTest {

	public static void main(String[] args) {
//		MyDate date = new MyDate();
		MyDate date2 = new MyDate(2021,2,29);
		MyDate date3 = new MyDate(2020,2,29);
		MyDate date4 = new MyDate(2030,3,20);
		date2.isValid();
		date3.isValid();
		date4.isValid();
//		date.month = 2;
//		date.year = 2018;
//		date.day = 32; // ???? ?߻?.
	}

}
