package task08;

public class Task08 {
	
	String a;
	Task08 (String a){
		this.a=a;
	}
	
	String toLowerCase(){
	    
		String b=a;
	    char[]c1=a.toCharArray();
	    int x=c1.length;
	    int[]c=new int[x];
	    
	    for(int print=0;print<b.length();print++){
	       c[print]=(int)c1[print]; 
	    }
	    for(int check=0;check<c.length;check++){
	      if(c[check]>=65&&c[check]<=90){
	        c[check]=c[check]+32;
	      }
	    }
	    char c2[]=new char[c1.length];
	    for(int ch=0;ch<c.length;ch++){
	      c2[ch]=(char)(c[ch]);
	    }
	    String s=String.valueOf(c2);
	    return s;
	}

}
