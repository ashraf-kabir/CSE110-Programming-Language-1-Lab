package homework04;

import java.util.Scanner;

public class Task20 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int b = 1;
        
        for (; a > 0; a /= 10) {
            b = a % 10;
            System.out.print(b + ", ");
        }
        System.out.println();
    }
    
}
