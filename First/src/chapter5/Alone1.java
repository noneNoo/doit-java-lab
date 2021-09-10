package chapter5;

public class Alone1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2); // add 함수를 호출하여 sum 변수에 담는다
		int sub = subNum(num1, num2);
		int mul = mulNum(num1, num2);
		double div = divNum(num1, num2);
		
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + sub);
		System.out.println(num1 + " * " + num2 + " = " + mul);
		System.out.println(num1 + " / " + num2 + " = " + div);
		
	}
	
	// 함수 선언
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static int subNum(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mulNum(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}
	
	public static double divNum(int n1, int n2) {
		double result = n1 / n2;
		return result;
	}
}
