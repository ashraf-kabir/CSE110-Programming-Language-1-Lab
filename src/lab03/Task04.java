package lab03;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int n = sc.nextInt();

		if (n % 2 == 0 && n % 5 == 0) {
			System.out.println(n);
		} else if (n % 2 == 0) {
			System.out.println("Multiple of 2");
		} else if (n % 5 == 0) {
			System.out.println("Multiple of 5");
		} else {
			System.out.println("Not multiple of 2 or 5");
		}
	}

}
