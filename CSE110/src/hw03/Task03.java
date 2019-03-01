package hw03;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter height: ");
		double h = sc.nextDouble();
		
		System.out.println("Enter width: ");
		double w = sc.nextDouble();
		
		System.out.println("Area of rectangle is = " + h*w);
	}

}
