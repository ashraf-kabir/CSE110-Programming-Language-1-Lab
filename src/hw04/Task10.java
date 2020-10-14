package hw04;

/**
 * Task 10:
 * Write javacode of a program that asks the user to enter ten numbers then display ONLY the total and the average of the odd numbers among those ten numbers.
 * [Hint: Example Input: 1 2 3 4 5 6 7 8 9 10 and Example Output: Total is 25 and Average is 5 (i.e., Total is 25
 * = (1+3+5+7+9) and Average is 25/5 = 5)]
 */

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
