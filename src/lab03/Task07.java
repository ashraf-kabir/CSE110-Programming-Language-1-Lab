package lab03;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter mark for a single subject: ");
		int x = sc.nextInt();

		if (x > 50) {
			System.out.println("Pass");
		} else {
			System.out.println("You shall not pass");
		}
	}

}
