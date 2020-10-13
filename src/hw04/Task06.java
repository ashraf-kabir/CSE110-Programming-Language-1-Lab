package hw04;

import java.util.Scanner;

public class Task06 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter range: ");
        int n = sc.nextInt();
        
        int y = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                y -= (i * i);
            } else {
                y += (i * i);
            }
        }
        System.out.println(y);
    }
    
}
