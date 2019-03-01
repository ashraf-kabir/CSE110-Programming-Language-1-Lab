package task18;

import static java.lang.System.out;

public class GenericMerhodNoOverload {
    public static void main(String[] args) {

        Integer[] iarr = {1, 2, 3, 4};
        Character[] carr = {'b', 'u', 'c', 'k', 'y'};

        printMe(iarr);
        printMe(carr);
    }

    //generic method
    private static <T> void printMe(T[] x) {
        for (T b : x) {
            out.printf("%s ", b);
        }
        out.println();
    }
}
