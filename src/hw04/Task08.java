package hw04;

/*
 * Write javacode of a program which adds all numbers that are multiples of either 7 or 9 up to 600.
 * Ensure that numbers like 63 are added only once in the sum.
*/

public class Task08 {
    
    public static void main(String[] args) {
        
        int sum = 0;
        for (int a = 1; a <= 600; a++) {
            if ((a % 7 == 0) || (a % 9 == 0)) {
                sum += a;
            }
        }
        System.out.println(sum);
    }
    
}