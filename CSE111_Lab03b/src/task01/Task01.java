package task01;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n[]= new int[10];
		
		for(int a=0; a<n.length; a++){              //forward array input loop
			System.out.println("Enter a number:");
			n[a]=sc.nextInt();
		}
		
		for(int b=n.length-1; b>=0; b--){           //reverse array loop
			System.out.printf(n[b]+"\n");
		}

	}

}
