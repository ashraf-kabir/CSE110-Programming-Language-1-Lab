package task05;

import java.util.Scanner;

public class Task05Main {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first string");
		String str = sc.nextLine();
		
		System.out.println("Enter the old character");
		String oldChar = sc.nextLine();
		
		System.out.println("Enter the new character");
		String newChar = sc.nextLine();
		
		Task05 t=new Task05(str);
	    System.out.println(t.replaceFirst(oldChar,newChar));
		
	}
}
