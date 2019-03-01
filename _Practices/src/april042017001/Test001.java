package april042017001;

import java.util.Scanner;

public class Test001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int a = sc.nextInt();
		System.out.println("Enter a number: ");
		int b = sc.nextInt();
		
		double p = Math.pow(a, b);  //a is base && b is power
		double q = Math.sqrt(a);
		double r = Math.cbrt(b);
		double i = Math.PI;
		double j = Math.toRadians(a);        //java cannot calculate degree so it needs to convert on rad
		double k = Math.sin(j);              //then works
		double l = Math.sin(Math.toRadians(a));
		
		
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
	}

}
