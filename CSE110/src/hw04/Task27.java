package hw04;

public class Task27 {
    public static void main(String[] args) {
        int i = 0;
        int num = 0;
        int c = 0;
        String primeNum = "";
        for (i = 1; i < 1000; i++) {
            int counter = 0;
            for (num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                primeNum = primeNum + i + " ";
                c++;
            }
        }
        System.out.println("Total prime number is " + c);
        System.out.println("Prime numbers below 1000:");
        System.out.println(primeNum);
    }
}