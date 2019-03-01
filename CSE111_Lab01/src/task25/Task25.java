package task25;

import java.util.Scanner;

public class Task25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");

		int n = sc.nextInt();
		for (int i = 1; i <= 1; i++) {
			for (int j = 1; j <= n - i; j++) {
				String space = " ";
				System.out.print(space);
			}

			for (int star = 1; star <= 2 * i - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int d = 3;
		for (int a = 2; a <= n; a++) {
			for (int s = 1; s <= n - a; s++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			for (int f = 2; f < d; f++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			System.out.println();
			d += 2;
		}
		int g = 1;
		int h = 2 * n - 3;
		int k = d - 4;
		for (int z = 1; z < n - 1; z++) {
			for (int x = 1; x <= g; x++) {
				String space = " ";
				System.out.print(space);
			}
			g++;
			System.out.print("*");
			for (int y = 2; y < k; y++) {
				String space = " ";
				System.out.print(space);
			}
			System.out.print("*");
			System.out.println();
			k -= 2;
		}
		for (int u = 1; u <= 1; u++) {
			for (int o = 1; o <= n - u; u++) {
				String space = " ";
				System.out.print(space);
			}
			for (int p = 1; p <= 1; p++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
