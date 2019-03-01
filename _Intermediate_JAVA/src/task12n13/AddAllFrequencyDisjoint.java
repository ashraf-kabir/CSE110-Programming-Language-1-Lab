package task12n13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class AddAllFrequencyDisjoint {
    public static void main(String[] args) {

        //convert stuff array to a list
        String[] stuff = {"apples", "beef", "corn", "ham"};
        List<String> list1 = Arrays.asList(stuff);

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("youtube");
        list2.add("google");
        list2.add("twitter");

        for (String x: list2) {
            out.printf("%s ", x);
        }

        Collections.addAll(list2, stuff);

        out.println();
        for (String x: list2) {
            out.printf("%s ", x);
        }
        out.println();

        out.println(Collections.frequency(list2, "twitter"));

        boolean tof = Collections.disjoint(list1, list2);
        out.println(tof);

        if (tof) {
            out.println("These list don't have anything in common");
        } else {
            out.println("These list must have something in common");
        }
    }
}