package hw04;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your favourite car's name: ");
        String x = sc.nextLine();

        System.out.println("How many times do you want to see that name: ");
        int n = sc.nextInt();

        for (int c = 1; c <= n; c++) {
            System.out.println(x);
        }

    }

}
