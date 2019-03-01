package task17;

import static java.lang.System.out;

public class GenericMethod {
    public static void main(String[] args) {

        Integer[] iarr = {1, 2, 3, 4};
        Character[] carr = {'b', 'u', 'c', 'k', 'y'};

        printMe(iarr);
        printMe(carr);
    }

    private static void printMe(Integer[] i) {
        for (Integer x : i) {
            out.printf("%s ", x);
        }
        out.println();
    }
    private static void printMe(Character[] i) {
        for (Character x : i) {
            out.printf("%s ", x);
        }
        out.println();
    }
}
