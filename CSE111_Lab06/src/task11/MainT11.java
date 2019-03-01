package task11;

import java.util.Scanner;

public class MainT11{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Word");
		String a=sc.nextLine();
		System.out.println("Enter Second Word");
		String b=sc.nextLine();
		
		Task11 t=new Task11(a,b);
		System.out.println(t.equalsIgnoreCase());
	}

}