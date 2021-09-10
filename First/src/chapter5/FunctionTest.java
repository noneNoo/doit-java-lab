package chapter5;

public class FunctionTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = addNum(num1, num2); // add 함수를 호출하여 sum 변수에 담는다
		
		System.out.println(num1 + " + " + num2 + " = " + sum);
	}
	
	// 함수 선언
	public static int addNum(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
}
