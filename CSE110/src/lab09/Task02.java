package lab09;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		int max = n[0];
		int maxLoc = 0;

		for (int b = 0; b < n.length; b++) {
			if (n[b] > max) {
				max = n[b];
				maxLoc = b;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The position of it's index is " + maxLoc);
	}

}
