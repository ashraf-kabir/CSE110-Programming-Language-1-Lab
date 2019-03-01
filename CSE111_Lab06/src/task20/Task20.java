package task20;

import java.util.Scanner;

public class Task20 {
    
	public static void main (String[] args) {
        
		Scanner sc = new Scanner (System.in);
        
		System.out.println("Please enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Please enter second string: ");
        String s2 = sc.nextLine();
        
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        char [] concat = new char [ch1.length+ch2.length];
        
        for(int i=0; i<concat.length; i++){
            if(i<ch1.length){
                concat[i] = ch1[i];
            }
            else{
                concat[i] = ch2[i-ch1.length];
            }
        }
        
        for (int j=0; j<concat.length; j++){
            System.out.print(concat[j]);
        }
    }

}
