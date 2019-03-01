package task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str1= sc.next();
		
		char [] ch = str1.toCharArray();
		
		System.out.println("Length is "+ch.length);
	}

}
