package task04;

import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int []n=new int[10];
		
		for(int a=0; a<n.length;){                                     //no increment used
			System.out.printf("Enter number %d: ", a+1);
			n[a]=sc.nextInt();
			
			boolean duplicate=false;
			
			for(int b=0; b<a; b++){
				if(n[b]==n[a]){
					System.out.println("No duplicates are allowed, input again");
					duplicate=true;
					break;
				}
			}
			if(!duplicate){
				a++;
			}
		}
	}

}
