package dijkstra;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DijkstraTest {

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader(
				"F:\\workspace eclipse\\workspace eclipse neon 2\\CSE221 Lab06 Shortest Path (DIjkstra's algorithm)\\src\\dijkstra\\input.txt");
		Scanner scanner = new Scanner(fileReader);
		int[][] matrix = null;
		int src = 0;
		int c = 0;
		while (scanner.hasNextLine()) {
			if (c == 0) {
				int x = Integer.parseInt(scanner.nextLine());
				size = x + 1;
				matrix = new int[x + 1][x + 1];
				src = Integer.parseInt(scanner.nextLine());

			} else {
				String s = scanner.nextLine();
				StringTokenizer st = new StringTokenizer(s, ",");
				int x = 0;
				int y = 0;
				int z = 0;
				while (st.hasMoreTokens()) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					z = Integer.parseInt(st.nextToken());
				}
				matrix[x][y] = z;
			}
			c++;
		}
		fileReader.close();

		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + ", ");
			}
			System.out.println();
		}
		System.out.println();

		Dijkstra(matrix, src);

		System.out.println("destination-Source path:");
		for (int i = 1; i < size; i++) {
			int x = i;
			System.out.print(x + "-> ");
			while (prev[x] != 0) {
				System.out.print(prev[x] + "-> ");
				x = prev[x];
			}
			System.out.print("S");
			System.out.println();
		}

	}

	static int size = 0;
	static int[] prev;

	static void Dijkstra(int matrix[][], int src) {
		int dist[] = new int[size];
		prev = new int[size];
		Boolean discovered[] = new Boolean[size];

		for (int i = 0; i < size; i++) {
			dist[i] = Integer.MAX_VALUE;
			discovered[i] = false;
		}

		dist[src] = 0;

		for (int count = 0; count < size; count++) {
			int u = minDistance(dist, discovered);

			discovered[u] = true;

			for (int v = 0; v < size; v++) {
				if (!discovered[v] && matrix[u][v] != 0 && dist[u] != Integer.MAX_VALUE
						&& dist[u] + matrix[u][v] < dist[v]) {
					dist[v] = dist[u] + matrix[u][v];
					prev[v] = u;
				}
			}
		}

		System.out.println("Vertex   Distance from Source");
		for (int i = 0; i < size; i++)
			System.out.println(i + " \t\t " + dist[i]);
	}

	public static int minDistance(int dist[], Boolean sptSet[]) {

		int min = Integer.MAX_VALUE;
		int min_index = -1;

		for (int i = 0; i < size; i++) {
			if (sptSet[i] == false && dist[i] <= min) {
				min = dist[i];
				min_index = i;
			}
		}
		return min_index;
	}

}
