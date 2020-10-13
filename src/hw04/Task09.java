package hw04;

/**
 * Task 9: Write javacode of a program which adds all numbers that are multiples of either 7 or 9 but not both, up to 600.
 */

public class Task09 {
    public static void main(String[] args) {
        int sum7 = 0;
        int sum9 = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) {
                sum7 += i;
            } else if (i % 9 == 0) {
                sum9 += i;
            }
        }
        System.out.println("sum of multiples of 7 = " + sum7);
        System.out.println("sum of multiples of 9 = " + sum9);
    }
}
