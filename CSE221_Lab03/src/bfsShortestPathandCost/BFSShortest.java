package bfsShortestPathandCost;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFSShortest {
	
	public static void bfs(int[][] g, int s) {

        Vertex[] n = new Vertex[g.length];
        for (int i = 0; i < n.length; i++) {
            n[i] = new Vertex(99999, 0, 0);
        }
        n[s].color = 1;
        n[s].d = 0;
        n[s].p = -1;

        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while (q.size() != 0) {
            int u = q.remove();
            for (int v = 0; v < g.length; v++) {
                if (g[u][v] == 1) {
                    if (n[v].color == 0) {
                        n[v].color = 1;
                        n[v].d = n[u].d + 1;
                        n[v].p = u;
                        q.add(v);
                    }
                }
            }
            n[u].color = 2;
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Insert distance:");
        int x = sc.nextInt();
        System.out.printf("Shortest path: " + x);
        x--;
        int dis = x;
        while (n[x].p != -1) {
            System.out.print(" -> ");
            System.out.print(n[x].p + 1);
            x = n[x].p;
        }
        System.out.println();
        System.out.println("Cost: " + n[dis].d);
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(
                new File("F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab03 BFS (shortest path & cost)\\src\\bfsShortestPathandCost\\BFSInput.txt"));
        int n = sc.nextInt();
        int graph[][] = new int[n][n];
        int s = sc.nextInt();
        int src = s - 1;
        while (sc.hasNextInt()) {
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            graph[v1 - 1][v2 - 1] = 1;
            graph[v2 - 1][v1 - 1] = 1;
        }
        bfs(graph, src);
    }
	
}
