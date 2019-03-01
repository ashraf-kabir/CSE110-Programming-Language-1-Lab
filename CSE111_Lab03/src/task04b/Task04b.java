package task04b;

import java.util.Scanner;

public class Task04b {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a lowercase lettered name:");
		String x= sc.nextLine();
		
		int[] n= new int[26];
		
		for(int a=0; a<x.length(); a++){
			int p=x.codePointAt(a);
			int q = p-97;
			n[q]++;
		}
		for(int b=0; b<26; b++){
			int r = b+97;
			char z= (char)r;      //typecasting
			System.out.printf(z+" which is "+r+" was found "+n[b]+" times"+"\n");
		}
	}
	
}
