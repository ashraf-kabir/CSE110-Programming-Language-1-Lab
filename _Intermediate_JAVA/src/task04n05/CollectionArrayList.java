package task04n05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

public class CollectionArrayList {
    public static void main(String[] args) {

        String[] things = {"eggs", "lasers", "hats", "pie"};
        List<String> list1 = new ArrayList<>();

        //add array items to list
        for (String x: things) {
            list1.add(x);
        }

        String[] morethings = {"lasers", "hats"};
        List<String> list2 = new ArrayList<>();

        //add array items to list
        for (String x: morethings) {
            list2.add(x);
        }

        for (int i=0; i<list1.size(); i++) {
            out.printf("%s ", list1.get(i));
        }

        editlist(list1, list2);
        out.println();

        for (int i=0; i<list1.size(); i++) {
            out.printf("%s ", list1.get(i));
        }
        
    }

    public static void editlist(Collection<String> l1, Collection<String> l2) {
        Iterator<String> it = l1.iterator();
        while (it.hasNext()) {
            if (l2.contains(it.next()))
                it.remove();
        }
    }
}
