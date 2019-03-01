package task16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static java.lang.System.out;

public class HashSetTest {
    public static void main(String[] args) {

        String[] things = {"apple", "bob", "ham", "bob", "bacon"};
        List<String> list = Arrays.asList(things);

        out.printf("%s ", list);
        out.println();

        //to remove duplicate
        Set<String> set = new HashSet<String>(list);
        out.printf("%s ", set);
        out.println();
    }
}
