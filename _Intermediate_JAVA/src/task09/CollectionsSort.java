package task09;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class CollectionsSort {
    public static void main(String[] args) {

        String[] crap = {"apples", "lemons", "geese", "bacon", "youtube"};
        List<String> l1 = Arrays.asList(crap);

        Collections.sort(l1);
        out.printf("%s\n", l1);          //alphabetical order

        Collections.sort(l1, Collections.reverseOrder());
        out.printf("%s\n", l1);          //reverse order
    }
}
