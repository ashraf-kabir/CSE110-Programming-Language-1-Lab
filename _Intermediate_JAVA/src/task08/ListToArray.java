package task08;

import java.util.Arrays;
import java.util.LinkedList;

import static java.lang.System.out;

public class ListToArray {
    public static void main(String[] args) {

        String[] stuff = {"babies", "watermelong", "melons", "fudge"};
        LinkedList<String> theList = new LinkedList<>(Arrays.asList(stuff));

        theList.add("pumpikinf");
        theList.addFirst("firstthing");

        //convert back to array
        stuff = theList.toArray(new String[theList.size()]);

        for (String x : stuff) {
            out.printf("%s ", x);
        }
    }
}
