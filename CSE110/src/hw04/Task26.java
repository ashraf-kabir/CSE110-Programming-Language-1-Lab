package homework04;

import java.util.Scanner;

public class Task26 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        int primeC = 0;
        
        for (int c = 2; c < n; c++) {
            if (n % c == 0) {
                primeC++;
            }
        }
        
        if (primeC == 0) {
            System.out.println("Your input is a prime number.");
        } else {
            System.out.println("Your input is not a prime number.");
        }
    }
    
}
