package hw04;

import java.util.Scanner;

public class Task05 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range:");
        int n = sc.nextInt();
        
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x = x + (i * i * i);
        }
        System.out.println(x);
    }
    
}
