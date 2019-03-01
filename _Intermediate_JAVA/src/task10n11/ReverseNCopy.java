package task10n11;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class ReverseNCopy {
    public static void main(String[] args) {

        //create an array and convert to list
        Character[] ray = {'p', 'w', 'n'};
        List<Character> list = Arrays.asList(ray);
        out.println("List is : ");
        output(list);

        //reverse and print out the list
        Collections.reverse(list);
        out.println("After reverse : ");
        output(list);

        //create a new array and a new list
        Character[] newRay = new Character[3];
        List<Character> listCopy = Arrays.asList(newRay);

        //copy contents of list into listCopy
        Collections.copy(listCopy, list);
        out.println("Copy of list : ");
        output(listCopy);

        //fill collection with crap
        Collections.fill(list, 'X');
        out.println("After filling the list : ");
        output(list);
    }

    //output method
    private static void output(List<Character> thelist) {
        for (Character thing: thelist) {
            out.printf("%s ", thing);
        }
        out.println();
    }
}
