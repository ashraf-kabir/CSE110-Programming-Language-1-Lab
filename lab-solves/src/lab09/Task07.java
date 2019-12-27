package lab09;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int odd = 0; odd < n.length; odd++) {
			if (n[odd] % 2 != 0) {
				System.out.print(n[odd] + ", ");
			}
		}
		System.out.println();

		for (int even = 0; even < n.length; even++) {
			if (n[even] % 2 == 0) {
				System.out.print(n[even] + ", ");
			}
		}

	}

}
