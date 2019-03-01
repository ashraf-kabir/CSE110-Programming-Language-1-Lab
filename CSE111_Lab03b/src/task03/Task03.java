package task03;

import java.util.Scanner;

public class Task03 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n[]=new int[5];
		
		int temp=0;
		for(int a=0; a<n.length; a++){
			System.out.println("Enter a number:");
			n[a]=sc.nextInt();
		}
		
		for(int a=0; a<n.length; a++){           //high to low or descending order
			for(int b=0; b<n.length; b++){
				if(n[b]<n[a]){
					temp=n[a];
					n[a]=n[b];
					n[b]=temp;
				}
			}
		}
		for(int d=0; d<n.length; d++){
			System.out.printf(n[d]+"\n");
		}

	}

}
