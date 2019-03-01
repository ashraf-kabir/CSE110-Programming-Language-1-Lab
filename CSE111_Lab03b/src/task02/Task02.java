package task02;

import java.util.Scanner;

public class Task02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] n= new int[10];
		
		for(int a=0; a<n.length; a++){
			System.out.println("Enter a number:");
			n[a]=sc.nextInt();
			System.out.print("You have entered ");
			for(int b=0; b<=a; b++){
				System.out.printf(n[b]+", ");
			}
			System.out.printf("\n");
		}
	}

}
