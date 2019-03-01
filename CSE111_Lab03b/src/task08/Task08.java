package task08;

import java.util.Scanner;

public class Task08 {
	
	public static void main (String[] args) {
        
    	Scanner sc = new Scanner(System.in);
        int []n = new int[10];
        
        for(int a=0; a<n.length; a++){
            System.out.println("Enter a number:");
            int b = sc.nextInt();
            n[b]++;
        }
        for(int i=0; i<n.length; i++){
            if(n[i]>=2 && n[i]<5){
                System.out.println(i);
            }
        }
    }

}
