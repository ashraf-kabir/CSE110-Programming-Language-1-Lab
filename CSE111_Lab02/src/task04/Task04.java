package task04;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[20];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		System.out.print("Even numbers are in reverse order: ");
		for (int b = n.length - 1; b >= 0; b--) {
			if (n[b] % 2 == 0) {
				System.out.print(n[b] + " ");
			}
		}
		System.out.println();

	}

}
