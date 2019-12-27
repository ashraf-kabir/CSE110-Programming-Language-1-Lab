package Practices.cgpaCalculator;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What was your course 01?");
		String s1 = sc.next();
		System.out.println("What was your course 02?");
		String s2 = sc.next();
		System.out.println("What was your course 03?");
		String s3 = sc.next();
		System.out.println("What was your course 04?");
		String s4 = sc.next();
		
		System.out.println("Enter the grade point of "+s1+": ");
		double g1 = sc.nextDouble();
		System.out.println("Enter the grade point of "+s2+": ");
		double g2 = sc.nextDouble();
		System.out.println("Enter the grade point of "+s3+": ");
		double g3 = sc.nextDouble();
		System.out.println("Enter the grade point of "+s4+": ");
		double g4 = sc.nextDouble();
		
		System.out.println("How many credit was allocated for "+s1+"?");
		int c1=sc.nextInt();
		System.out.println("How many credit was allocated for "+s2+"?");
		int c2=sc.nextInt();
		System.out.println("How many credit was allocated for "+s3+"?");
		int c3=sc.nextInt();
		System.out.println("How many credit was allocated for "+s4+"?");
		int c4=sc.nextInt();
		
		double CGPA = (g1*c1+g2*c2+g3*c3+g4*c4)/(c1+c2+c3+c4);
		
		System.out.printf("Your CGPA is = %.2f", CGPA);
		
	}

}
