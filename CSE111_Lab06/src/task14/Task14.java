package task14;

public class Task14{
	
	String a;
	Task14(String a){
	    this.a=a;
	}
	
	String substring(int y){
		int x=y-1;
	    String s;
	    char c1[]=a.toCharArray();
	    char c[]=new char[c1.length];
	    if(x>=0&&x<=c1.length){
	      int count=0;
	      for(int print=x;print<c.length;print++){
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
