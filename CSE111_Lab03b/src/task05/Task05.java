package task05;

import java.util.Scanner;

public class Task05 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter E= voltage (volts): ");
		double E=sc.nextDouble();
		System.out.println("Enter R= resistance (ohms): ");
		double R=sc.nextDouble();
		System.out.println("Enter L= inductance (henrys): ");
		double L=sc.nextDouble();
		System.out.println("Enter C= capacitance (farads): ");
		double C=sc.nextDouble();
		System.out.println("Enter f= frequency (hertz): ");
		double f=sc.nextDouble();
		
		double p=2*3.1415*f*L;
		double q=2*3.1415*f*C;
		double i=(p-1.0/q)*(p-1.0/q);
		double j=R*R;
		double k=Math.sqrt(j+i);
		double I=E/k;
		System.out.println(I+" amperes");
	}

}
