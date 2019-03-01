package mst;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MST {
	
	public static void main(String[] args) throws IOException {

        BufferedReader read = new BufferedReader(new FileReader(
                "F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab05 MST (Prim's algorithm)\\src\\mst\\primGraph.txt"));
        String str = read.readLine();
        if (str != null) {
            String[] array = str.split(" ");
            int ver = array.length;
            int min = Integer.MAX_VALUE;
            int u = 0, v = 0, total = 0;
            int[] visited = new int[ver];
            int[][] matrix = new int[ver][ver];
            while ((str = read.readLine()) != null) {
                String[] s = str.split(" ");
                int row = Integer.parseInt(s[0]);
                int column = Integer.parseInt(s[1]);
                int weight = Integer.parseInt(s[2]);
                matrix[row][column] = weight;
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    if (matrix[i][j] == 0) {
                        matrix[i][j] = Integer.MAX_VALUE;
                    }
                }
            }
            visited[0] = 1;
            for (int counter = 1; counter < ver; counter++) {
                min = Integer.MAX_VALUE;
                for (int i = 0; i < ver; i++) {
                    if (visited[i] == 1) {
                        for (int j = 0; j < ver; j++) {
                            if (visited[j] != 1) {
                                if (min > matrix[i][j]) {
                                    min = matrix[i][j];
                                    u = i;
                                    v = j;
                                }
                            }
                        }
                    }
                }
                visited[v] = 1;
                total += min;
                System.out.println("Edge " + u + " -> " + v + " Weight " + min);
            }
            System.out.println("Minimum weight of tree: " + total);
        }
    }

}
