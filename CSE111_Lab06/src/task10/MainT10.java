package task10;

import java.util.Scanner;

public class MainT10{
	
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter First Word");
		String a=sc.nextLine();
		
		System.out.println("Enter Second Word");
		String b=sc.nextLine();
		
		Task10 t=new Task10(a,b);
		System.out.println(t.equals());
	}

}
