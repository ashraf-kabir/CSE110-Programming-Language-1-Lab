package homework04;

import java.util.Scanner;

public class Task14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double prod = 1;
        
        System.out.println("Enter range:");
        int r = sc.nextInt();
        
        for (int a = 1; a <= r; a++) {
            System.out.println("Enter a number:");
            double x = sc.nextDouble();
            prod = prod * x;
        }
        System.out.println("The product is "+prod);
    }
    
}
