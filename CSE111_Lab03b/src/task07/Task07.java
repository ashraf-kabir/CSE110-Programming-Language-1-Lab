package task07;

import java.util.Scanner;

public class Task07 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int count=0;
		
		int []n=new int[11];
		
		for(int a=0; a<n.length; a++){
			System.out.println("Enter a number:");
			n[a]=sc.nextInt();
			
			for(int b=0; b<1; b++){
				if(n[a]==n[b]){
					count++;
					if(count==5){
						System.out.println("Duplicate for the 5 times!! Please enter a new one from right now.");
						a--;
						count=0;
					}
				}
				else{
					continue;
				}
			}
		}
	}

}
