package lab09;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please input how many number do you want to store: ");
		int r = sc.nextInt();

		int n[] = new int[r];

		int temp = 0;
		int median = 0;

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		for (int a = 0; a < n.length; a++) {
			for (int b = 0; b < n.length; b++) {
				if (n[a] > n[b]) {
					temp = n[a];
					n[a] = n[b];
					n[b] = temp;
				}
			}
		}

		if (r % 2 != 0) {
			median = r / 2;
			System.out.println("The median is = " + n[median]);
		}

		else {
			int d = r / 2;
			median = n[d] + n[d - 1];
			double med = median / 2.0;
			System.out.println("The median is = " + med);

		}

	}

}
