package adjacencyList;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class AdjList {
	
	public static void main(String[] args) throws IOException {

        LinkedList arr[];
        int x;
        Scanner sc = new Scanner(new File(
                "F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab01 Adj Matix & Adj List\\src\\adjacencyList\\input.txt"));
        String line = sc.next();
        int s1 = Integer.parseInt(line);
        arr = new LinkedList[s1];
        x = Integer.parseInt(sc.next());
        for (int y = 0; y < s1; y++) {
            LinkedList j = new LinkedList();
            arr[y] = j;
        }
        for (int i = 0; i < x; i++) {
            String line2 = sc.next();
            int p = Integer.parseInt(line2);
            String line3 = sc.next();
            int q = Integer.parseInt(line3);
            LinkedList address = arr[p];
            address.addLast(q);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "-->");
            LinkedList address = arr[i];
            int sz = address.size();
            int o = 0;
            while (o != sz) {
                System.out.print(address.get(o));
                if (o + 1 != sz) {
                    System.out.print("-->");
                }
                o++;
            }
            System.out.println();
        }

    }
}
