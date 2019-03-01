package task06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[15];
		int c[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int b = 0; b < c.length; b++) {
			for (int e = 0; e < n.length; e++) {
				if (b == n[e]) {
					c[b]++;
				}
			}
		}
		for (int d = 0; d < c.length; d++) {
			System.out.println(d + " is here for " + c[d] + " times");
		}
	}

}
