package lab08;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
		}

		System.out.println("Enter the serial of index: ");
		int b = sc.nextInt();
		System.out.println(n[b]);

	}

}
