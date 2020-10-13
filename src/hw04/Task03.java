package hw04;

import java.util.*;

public class Task03 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        double n = sc.nextDouble();
        
        double max = n;
        double sum = n;
        
        for (int c = 1; c <= 19; c++) {
            System.out.println("Enter number:");
            double m = sc.nextDouble();
            if (m > max) {
                max = m;
            }
            sum += m;
        }
        double avg = sum / 20.0;
        System.out.println("Average of all numbers = " + avg);
        System.out.println("Maximum number = " + max);
    }
    
}
