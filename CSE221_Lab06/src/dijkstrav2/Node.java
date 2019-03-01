package dijkstrav2;

public class Node {

	public int dist;
	public int parent;
	public int color;

	public Node(int d, int p, int c) {
		dist = d;
		parent = p;
		color = c;
	}

}
