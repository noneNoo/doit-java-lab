package chapter4;

public class Quiz1 {
	public static void main(String[] args) {
		// operator���� +, -, *, / �� ��쿡 ��Ģ������ �����ϴ� ���α׷�
		int num1 = 10;
		int num2 = 2;
		char operator = '/';
		
		// 1. if���� else if������ �ۼ��غ���
		if(operator == '+') {
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		} else if(operator == '-') {
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		} else if(operator == '*') {
			System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		} else if(operator == '/') {
			System.out.println(num1 + " / " + num2 + " = " + ((double)num1 / num2));
		} else {
			System.out.println(operator +"���� �߸��Ǿ����ϴ�.");
		}
		
		// 2. switch������ �ۼ��غ���
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
			System.out.println(operator +"���� �߸��Ǿ����ϴ�.");
		}
	}

}