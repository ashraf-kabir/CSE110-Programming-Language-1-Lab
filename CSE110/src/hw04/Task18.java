package homework04;

import java.util.Scanner;

public class Task18 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        
        int c = 0;
        while (num > 0) {
            num /= 10;
            c++;
        }
        System.out.println(c);
        
    }
    
}
