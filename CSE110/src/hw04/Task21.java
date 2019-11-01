package hw04;

import java.util.Scanner;

public class Task21 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int num = sc.nextInt();
        
        int digitC = 0;
        int m = 0;
        for (int temp = num; temp > 0; temp /= 10) {
            digitC++;
        }
        int count = digitC;
        
        double prod = Math.pow(10, digitC - 1);
        int p = (int) prod;
        
        while (num > 0) {
            m = num / (int) prod;
            num %= (int) prod;
            prod /= 10;
            System.out.print(m+", ");
        }
        System.out.println("\n"+count);
        System.out.println(p);
    }
    
}
