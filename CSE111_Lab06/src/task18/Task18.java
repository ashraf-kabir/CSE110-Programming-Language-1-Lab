package task18;

import java.util.Scanner;

public class Task18 {
    
	public static void main(String[] args) {
        
		Scanner sc = new Scanner (System.in);
        
		System.out.println("Please enter a string: ");
        String s = sc.nextLine();
        System.out.println("Please enter a charecter: ");
        char n1 = sc.next().charAt(0);
        System.out.println("Please enter an integer: ");
        int n2 = sc.nextInt();
        
        char [] ch = s.toCharArray();
        
        int flag = 0;
        for (int i=n2; i<ch.length; i++){
            if(ch[i]==n1){
                System.out.println("Charecter is found at: "+i);
                break;
            }
            flag++;
        }
        
        if(flag==ch.length-n2){
            System.out.println(-1);
        }
    }

}
