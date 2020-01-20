package hw03;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks: ");

        int m = sc.nextInt();

        if (m > 50) {
            System.out.println("Pass");

        } else {
            System.out.println("You shall not pass");
        }

    }

}
