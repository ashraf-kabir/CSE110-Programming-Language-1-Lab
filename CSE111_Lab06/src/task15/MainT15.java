package task15;

import java.util.Scanner;

public class MainT15{
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Word");
		String a=sc.nextLine();
		System.out.println("Enter Sub string starting number");
		int b=sc.nextInt();
		System.out.println("Enter Sub string ending number");
		int c=sc.nextInt();
		
		Task15 t=new Task15(a);
		System.out.println(t.substring(b,c));
	}

}
