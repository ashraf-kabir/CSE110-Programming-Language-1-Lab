package homework03;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter grade of CSE110: ");
		double g1 = sc.nextDouble();
		System.out.println("Enter grade of ENG091: ");
		double g2 = sc.nextDouble();
		System.out.println("Enter grade of MAT110: ");
		double g3 = sc.nextDouble();
		System.out.println("Enter grade of PHY111: ");
		double g4 = sc.nextDouble();

		int c1 = 3, c2 = 0, c3 = 3, c4 = 3;

		double GPA = (g1 * c1 + g2 * c2 + g3 * c3 + g4 * c4) / (c1 + c2 + c3 + c4);

		System.out.println("Your GPA is = " + GPA);
	}

}
