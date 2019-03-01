package task01;

import static java.lang.System.out;

public class StringMethods {
    public static void main(String[] args) {

        String[] words = {"funk", "chunk", "furry", "baconator"};

        //startsWith
        for (String w : words) {
            if (w.startsWith("fu")) {
                out.println(w + " starts with fu");
            }
        }

        //endsWith
        for (String w : words) {
            if (w.endsWith("unk")) {
                out.println(w + " ends with unk");
            }
        }

    }
}
