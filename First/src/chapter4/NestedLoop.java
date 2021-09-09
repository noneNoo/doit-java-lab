package chapter4;

public class NestedLoop {
	public static void main(String[] agrs) {
		for(int dan = 3; dan <= 7; dan++) {
			for(int times = 1; times <= 9; times++) {
				System.out.println(dan + "*" + times + "=" + (dan * times));
			}
			System.out.println();
		}
	}
}
