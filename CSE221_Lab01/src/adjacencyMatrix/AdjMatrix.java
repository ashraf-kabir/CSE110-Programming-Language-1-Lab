package adjacencyMatrix;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class AdjMatrix {
	
	public static void main(String[] args) throws IOException {
        
		Scanner sc = new Scanner(new File(
                "F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab01 Adj Matix & Adj List\\src\\adjacencyMatrix\\graph.txt"));

        int vertex = sc.nextInt();

        int[][] arr = new int[vertex + 1][vertex + 1];

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a][b] = 1;
            arr[b][a] = 1;
        }

        for (int row = 0; row < arr.length; row++) {
            for (int coloumn = 0; coloumn < arr[row].length; coloumn++) {
                System.out.print(arr[row][coloumn] + " ");
            }
            System.out.println();
        }
    }

}
