package Quiz;

import java.util.Scanner;

public class Codeup1024 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		for (int i = 0; i < str.length(); i++)
			System.out.println("'" + str.subSequence(i, i + 1) + "'");
	}
}
