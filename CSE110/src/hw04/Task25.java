package hw04;

import java.util.Scanner;

public class Task25 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        int factorC = 0;
        
        for (int c = 1; c <= n; c++) {
            if (n % c == 0) {
                factorC++;
            }
        }
        System.out.println(factorC);
    }
    
}
