package array;

public class Alone1 {

	public static void main(String[] args) {
		char[][] alphabets = new char[13][2];
		char ch = 'a';
		char ch2 = 'A';
		
		
		for(int i = 0; i < alphabets.length; i++) {
			for(int j = 0; j < alphabets[i].length; j++) {
				alphabets[i][j] = ch2;
				System.out.print(alphabets[i][j] + " ");
				ch2++;
			}
			System.out.println();
		}
	}

}
