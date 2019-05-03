package homework04;

import java.util.Scanner;

public class Task16 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number:");
        int n = sc.nextInt();
        
        int max = n;
        int min = n;
        int sum = n;
        
        for (int a = 1; a <= 9; a++) {
            System.out.println("Enter number:");
            int num = sc.nextInt();
            
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }
            sum += num;
        }
        double avg = sum / 10.0;
        System.out.println("Maximum= " + max);
        System.out.println("Minimum= " + min);
        System.out.println("Average= " + avg);
    }
    
}
