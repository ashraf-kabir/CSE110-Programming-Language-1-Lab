package task14;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of Circle: ");
		double m = sc.nextDouble();
		Circle s1=new Circle(m);
		System.out.println("Creating a Circle … done!");
	    System.out.println("The area of Circle is "+ s1.space());
	    
	    System.out.printf("\n");
	    
	    System.out.println("Enter radius of Sphere:");
	    double s=sc.nextDouble();
	    Sphere s2=new Sphere(s);
	    System.out.println("Creating a Sphere … done!");
	    System.out.println("The volume of sphere is "+s2.space());
	}

}
