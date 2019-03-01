package task06;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		
		int sum=0;
		
		for(int c=1; c<=n; c++){
			if(c%2==0){
				sum+=(c*c);
			} else{
				sum-=(c*c);
			}
		}
		System.out.println(sum);
	}

}
