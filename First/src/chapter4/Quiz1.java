package chapter4;

public class Quiz1 {
	public static void main(String[] args) {
		// operator값이 +, -, *, / 인 경우에 사칙연산을 수행하는 프로그램
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		// 1. if문과 else if문으로 작성해보기
		if(operator == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(operator == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(operator == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(operator == '/') {
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		} else {
			System.out.println(operator +"값이 잘못되었습니다.");
		}
		
		// 2. switch문으로 작성해보기
		switch(operator) {
		case '+' :
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
			break;
		case '-' :
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
			break;
		case '*' :
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
			break;
		case '/' :
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
			break;
		default :
			System.out.println(operator +"값이 잘못되었습니다.");
		}
	}

}
