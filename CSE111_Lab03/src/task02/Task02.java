package task02;

import java.util.Scanner;

public class Task02 {
	
    public static void main(String[] args) {
    	
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String str = sc.nextLine();
        
        for(int a=0; a<str.length(); a++){
            System.out.println(str.charAt(a));
        }
    }
    
}
