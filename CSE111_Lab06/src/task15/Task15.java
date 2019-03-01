package task15;

public class Task15{
	
	String a;
	Task15(String a){
		this.a=a;
	}
	
	String substring(int y,int z){
	    
		int x=y-1;
	    int i=z;
	    String s;
	    char c1[]=a.toCharArray();
	    char c[]=new char[c1.length];
	    if(x>=0&&x<=c1.length&&i>=0&&i<=c1.length){
	      int count=0;
	      for(int print=x;print<i;print++){
	        c[count]=c1[print];
	        count++;
	      }
	      s=String.valueOf(c);
	    
	    }
	    else{
	      s="not within the valid range";
	    }
	    return s;
	}
	
}
