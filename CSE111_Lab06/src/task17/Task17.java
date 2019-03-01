package task17;

import java.util.Scanner;

public class Task17{
    
	public static void main (String[] args){
        
		Scanner sc = new Scanner (System.in);
        
		System.out.println("Please enter a string: ");
        String s = sc.nextLine();
        System.out.println("Please enter a charecter: ");
        
        char n1 = sc.next().charAt(0);
        
        char [] ch = s.toCharArray();
        
        int flag = 0;
        for(int i=ch.length-1; i>=0; i--){
            if(ch[i]==n1){
                System.out.println("Charecter is found at: "+i);
                break;
            }
            flag++;
        }
        
        if(flag==ch.length){
            System.out.println(-1);
        }
    }

}
