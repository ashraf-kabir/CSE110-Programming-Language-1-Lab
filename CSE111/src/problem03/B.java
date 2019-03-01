package problem03;

public class B {
	
	public int x = 10;
	  public B(){
	    x++;
	    System.out.println("In the constructor "+x);
	  }
	  public B(int x){
	    x++;
	    System.out.println("In the constructor "+x);
	  }
	  public B(int [] x){
	    x[0]++;
	    System.out.println("In the constructor "+x[0]);
	  }

}
