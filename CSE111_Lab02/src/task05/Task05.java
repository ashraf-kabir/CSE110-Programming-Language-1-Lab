package task05;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}
		System.out.println("Enter a number whether it is stored or not: ");
		int d = sc.nextInt();

		for (int b = 0; b < n.length; b++) {
			if (n[b] == d) {
				System.out.println("Yes");
				break;
			} else {
				if (b == n.length - 1) {
					System.out.println("No");
				}
			}
		}
	}

}
