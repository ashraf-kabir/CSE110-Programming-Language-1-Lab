package lab08;

/**
 * Task 11
 * Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicateChecks.
 * This means that if a number has been entered already, the program will not accept it as input again and
 * instead ask the user to enter a different number.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int maxNum = 10;
        int[] arr = new int[maxNum];
        boolean duplicateCheck;
        int digC = 1;
        
        while (digC <= maxNum) {
            duplicateCheck = false;
            System.out.println("Enter number " + digC + ":");
            int temp = sc.nextInt();
            for (int i = 0; i <= digC - 2; i++) {
                if (temp == arr[i]) {
                    duplicateCheck = true;
                    break;
                }
            }
            if (duplicateCheck) {
                System.out.println("Sorry the last number has already been added");
            } else {
                arr[digC - 1] = temp;
                digC++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }

}
