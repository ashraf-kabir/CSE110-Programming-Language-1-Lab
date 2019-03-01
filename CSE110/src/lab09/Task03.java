package lab09;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		int max = n[0];
		int min = n[0];
		int maxLoc = 0;
		int minLoc = 0;

		for (int b = 0; b < n.length; b++) {
			if (n[b] > max) {
				max = n[b];
				maxLoc = b;
			}
		}
		System.out.println("The largest number is " + max);
		System.out.println("The position of the largest number on index is " + maxLoc);

		for (int d = 0; d < n.length; d++) {
			if (n[d] < min) {
				min = n[d];
				minLoc = d;
			}
		}
		System.out.println("The smallest number is " + min);
		System.out.println("The position of the smallest number on index is " + minLoc);

	}

}
