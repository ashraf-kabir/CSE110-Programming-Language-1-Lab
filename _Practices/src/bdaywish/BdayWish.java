package bdaywish;

import java.util.Scanner;

public class BdayWish {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name:");
		String x = sc.nextLine();

		System.out.println("Enter your birth year:");
		int birthYear = sc.nextInt();

		int count = 0;
		for (; birthYear <= 2016; birthYear++) {
			count++;
		}

		if (count > 0 && count < 13) {
			System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
			System.out.print("But you are a child only please grow up");
		}

		else if (count >= 13 && count <= 19) {
			System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
			System.out.print("But you are a teenager");
		}

		else if (count > 19 && count < 120) {
			System.out.print(x + ", your name has only " + x.length() + " alphabets. ");
			System.out.print("But you are matured enough");
		}

		System.out.print(" and " + count + " years old.");
		System.out.println();
		System.out.println("Happy Birthday, may God bless you & live long!");
	}
}
