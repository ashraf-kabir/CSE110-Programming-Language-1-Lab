package task14;

public class Circle extends Point {
	
	public Circle(double m){
		super(m);
	}
	
	public double space(){
		double area = Math.PI*getRadius()*getRadius();
		return area;
	}

}
