package task14;

import java.util.*;

public class Task14 {

	public static void main(String[] args) {

		int j;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter height of triangle in number:");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print(j);
			}
			for (j = i - 1; j >= 1; j--) {
				System.out.print(j);
			}
			System.out.printf("\n");
		}
	}

}
