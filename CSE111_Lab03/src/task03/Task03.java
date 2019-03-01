package task03;

import java.util.Scanner;

public class Task03 {
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name: ");
        String str = sc.nextLine();
        
        for(int a=0; a<str.length(); a++){
            System.out.println(str.charAt(a)+" : "+str.codePointAt(a));
        }
    }
    
}
