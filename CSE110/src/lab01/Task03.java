package lab01;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of a circle: ");
		double r = sc.nextDouble();

		double C = 2 * Math.PI * r;

		System.out.println(C);
	}

}
