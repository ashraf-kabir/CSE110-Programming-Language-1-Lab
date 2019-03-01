package task19;

import static java.lang.System.out;

public class GenericReturnType {
    public static void main(String[] args) {

        out.println(max(23, 42, 1));
        out.println(max("apples", "tots", "chicken"));
    }

    private static <T extends Comparable<T>> T max(T a, T b, T c) {
        T m = a;

        if (b.compareTo(a) > 0) {
            m = b;
        }

        if (c.compareTo(m) > 0) {
            m = c;
        }

        return m;
    }
}
