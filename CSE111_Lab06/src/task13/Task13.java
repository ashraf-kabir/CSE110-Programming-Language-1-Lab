package task13;

import java.util.Scanner;

public class Task13{
    
	public static void main (String[] args) {
        
		Scanner sc = new Scanner (System.in);
        
		System.out.println("Please enter first string: ");
        String s1 = sc.nextLine();
        System.out.println("Please enter second string: ");
        String s2 = sc.nextLine();
        
        char [] ch1 = s1.toCharArray();
        char [] ch2 = s2.toCharArray();
        
        for (int i=0; i<ch1.length; i++){
            int temp = 0;
            if ((int)ch1[i]>=65 && (int)ch1[i]<=90){
                temp = (int)ch1[i] + 32;
                ch1[i] = (char)temp;
            }
        }
        
        for(int i=0; i<ch2.length; i++){
        	int temp = 0;
            if ((int)ch2[i]>=65 && (int)ch2[i]<=90){
                temp = (int)ch2[i] + 32;
                ch2[i] = (char)temp;
            }
        }
        
        if(ch1.length>=ch2.length){
            int temp = 0;
            for (int i=0; i<ch2.length; i++){
                if(ch1[i]!=ch2[i]){
                    System.out.println((int)ch1[i]-(int)ch2[i]);
                    break;
                }
                temp++;
            }
            if (temp==ch2.length){
                System.out.println(0);
            }
        }
        
        else if(ch1.length<ch2.length){
            int temp = 0;
            for (int i=0; i<ch1.length; i++){
                if(ch2[i]!=ch1[i]){
                    System.out.println((int)ch2[i]-(int)ch1[i]);
                    break;
                }
            }
            if (temp==ch2.length){
                System.out.println(0);
            }
        }
    }

}
