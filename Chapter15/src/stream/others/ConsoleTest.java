package stream.others;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		// console Ŭ������ ��ȯ
		// Console�� ��Ŭ���� ȯ�濡�� ������ �� ����. ���� �͹̳�â���� ����ؾ� �Ѵ�.
		Console console = System.console();
		
		System.out.println("�̸�:");
		String name = console.readLine();
		System.out.println("����:");
		String job = console.readLine();
		System.out.println("��й�ȣ:");
		// char�� �н����带 �ϳ��ϳ� �޾ƿ´�...?
		char[] password = console.readPassword();
		String strpass = new String(password);
		
		System.out.println("�̸�: " + name);
		System.out.println("����: " + job);
		System.out.println("��й�ȣ: " + strpass);
		System.out.println(password);
	}

}
