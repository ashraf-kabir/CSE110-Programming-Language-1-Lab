package dijkstrav2;

import java.io.File;
import java.util.Scanner;

public class Dijkstra {

	public static void dij(int[][] a, int s) {
		Node[] no = new Node[a.length];
		for (int i = 0; i < no.length; ++i) {
			no[i] = new Node(999999, -1, 0);
		}
		no[s].dist = 0;

		for (int q = 0; q < a.length; ++q) {
			int u = extractMin(no);
			int tmp = 0;
			for (int i = 0; i < a.length; ++i) {
				if (a[u][i] > 0 && no[i].color == 0) {
					tmp = a[u][i] + no[u].dist;
					if (tmp < no[i].dist) {
						no[i].dist = tmp;
						no[i].parent = u;
					}
				}
			}
			no[u].color = 1;
		}

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("\nType destination");
			int x = sc.nextInt();
			System.out.print("cost: " + no[x - 1].dist + "\nShortest path: " + x);
			x--;
			while (x != s) {
				x = no[x].parent;
				System.out.print(" -> " + (x + 1));
			}
			System.out.println();
		}
	}

	public static int extractMin(Node[] no) {
		int min = 99999;
		int minIndex = 0;
		for (int i = 0; i < no.length; ++i) {
			if (no[i].color == 0) {
				if (no[i].dist < min) {
					min = no[i].dist;
					minIndex = i;
				}
			}
		}
		return minIndex;
	}

	public static void main(String[] args) {
		try {
			File a = new File(
					"F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab06 Shortest Path (DIjkstra's algorithm)\\src\\dijkstrav2\\graph.txt");
			Scanner s = new Scanner(a);
			int l = 0;
			int n = 0;
			int[][] b = null;
			while (s.hasNextLine()) {
				String s1 = s.nextLine();
				if (l == 0) {
					n = Integer.parseInt(s1);
					b = new int[n][n];
				} else {
					String[] s2 = s1.split(",");
					int m1 = Integer.parseInt(s2[0]) - 1;
					int m2 = Integer.parseInt(s2[1]) - 1;
					int m3 = Integer.parseInt(s2[2]);
					b[m1][m2] = m3;
				}
				l++;
			}
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Type source");
			int src = sc1.nextInt();
			dij(b, src - 1);
		} catch (Exception ex) {
			System.out.println("exception: " + ex);
		}
	}

}
