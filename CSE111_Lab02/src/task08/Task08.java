package task08;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n[] = new int[10];

		for (int a = 0; a < n.length; a++) {
			System.out.println("Enter number: ");
			int var = sc.nextInt();
			int v = 0;
			for (int b = 0; b < a; b++) {
				if (n[b] == var) {
					System.out.println("Duplicate found!");
					v = 1;
					break;
				}
			}
			if (v == 0) {
				n[a] = var;
			} else {
				a--;
			}
		}
		for (int d = 0; d < n.length; d++) {
			System.out.println(n[d]);
		}
	}

}
