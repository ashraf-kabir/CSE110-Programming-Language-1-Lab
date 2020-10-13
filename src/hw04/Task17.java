package hw04;

/**
 * Task 17:
 * In mathematics, the Fibonacci numbers form a sequence defined by the following recurrence relation:
 * That is, after two starting values, each number is the sum of the two preceding numbers.
 * The first Fibonacci numbers, also denoted as Fn, for n = 0, 1, … , are: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233,
 * Write javacode of a program, which prints all Fibonacci numbers that are less than 1600.
 */

public class Task17 {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series less than 1600->");

        int c = 0;
        for (int i = 1; a <= 1600; ++i) {
            System.out.print(a + ", ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
