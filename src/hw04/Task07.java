package hw04;

/**
 * Task 7:
 * Write javacode of a program which adds all numbers that are multiples of both 7 and 9 up to 600.
 */

public class Task07 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for (int a = 1; a <= 600; a++) {
            if ((a % 7 == 0) && (a % 9 == 0)) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
    
}
