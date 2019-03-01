package task07;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			n[a] = sc.nextInt();
			for (int b = 0; b <= a; b++) {
				System.out.print(n[b] + " ");
			}
			System.out.println();
		}

	}

}
