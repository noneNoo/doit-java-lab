package stream.others;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�̸�: ");
		String name = scn.nextLine();
		System.out.println("����: ");
		String job = scn.nextLine();
		System.out.println("���: ");
		int jobNum = scn.nextInt();
		
		System.out.println(name);
		System.out.println(job);
		System.out.println(jobNum);
		scn.close();
	}

}
