package homework04;

import java.util.Scanner;

public class Task10 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        int oddC = 0;
        for (int a = 0; a <= 5; a++) {
            System.out.println("Enter number: ");
            int n = sc.nextInt();
            
            if (n % 2 != 0) {
                oddC++;
                sum += n;
            }
        }
        double avg = sum / oddC;
        System.out.println(avg);
    }
    
}
