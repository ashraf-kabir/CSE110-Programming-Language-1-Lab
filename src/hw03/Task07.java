package hw03;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();

        double s = (x + y + z) / 2.0;

        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));

        System.out.println(area);
    }

}
