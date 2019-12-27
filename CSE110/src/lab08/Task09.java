package lab08;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		System.out.println("Enter a number to check whether it is previously inputted or not: ");
		int d = sc.nextInt();

		for (int b = 0; b < n.length; b++) {
			if (d == n[b]) {
				System.out.println("Yes, it's stored.");
				break;
			} else {
				if (b == n.length - 1) {
					System.out.println("No, it's not stored.");
				}
			}
		}

	}

}
