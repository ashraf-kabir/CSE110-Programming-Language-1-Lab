package bfsShortestPathandCost;

public class Vertex {
	
    public int d;
    public int p;
    public int color;

    public Vertex(int dist, int parent, int c) {
        d = dist;
        p = parent;
        color = c;
    }

}
