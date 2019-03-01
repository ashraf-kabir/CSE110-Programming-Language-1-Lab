package task09;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			int num = sc.nextInt();
			n[a] = num;
		}
		for (int b = 0; b < n.length; b += 2) {
			if (b == n.length - 1) {
				System.out.print(n[b] + ".");
			} else {
				System.out.print(n[b] + ",");
			}
		}
		for (int b = 1; b < n.length; b += 2) {
			if (b == n.length - 1) {
				System.out.print(n[b] + ".");
			} else {
				System.out.print(n[b] + ",");
			}
		}
		System.out.println();
	}

}
