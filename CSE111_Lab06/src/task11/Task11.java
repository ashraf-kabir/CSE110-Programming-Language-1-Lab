package task11;

public class Task11{
	
	String a,b;
	Task11(String a,String b){
	    this.a=a;
	    this.b=b;
	}
	String equalsIgnoreCase(){
	    
		String s="false";
	    
		char c1[]=a.toCharArray();
	    char d1[]=b.toCharArray();
	    int x=c1.length;
	    int[]c2=new int[x];
	    for(int print=0;print<b.length();print++){
	       c2[print]=(int)c1[print]; 
	    }
	    for(int check=0;check<c2.length;check++){
	      if(c2[check]>=65&&c2[check]<=90){
	        c2[check]=c2[check]+32;
	      }
	    }
	    char c[]=new char[c1.length];
	    for(int ch=0;ch<c.length;ch++){
	      c[ch]=(char)(c2[ch]);
	    }
	    int y=d1.length;
	    int[]d2=new int[y];
	    for(int print=0;print<b.length();print++){
	       d2[print]=(int)d1[print]; 
	    }
	    for(int check=0;check<d2.length;check++){
	      if(d2[check]>=65&&d2[check]<=90){
	        d2[check]=d2[check]+32;
	      }
	    }
	    char d[]=new char[d1.length];
	    for(int ch=0;ch<c.length;ch++){
	      d[ch]=(char)(d2[ch]);
	    }
	    if(c.length==0&&d.length==0){         //if inputs are null
	      s="TRUE";
	    }
	    else if(d.length==c.length){          //if the length of comparing string is equal 
	      int count=0;
	      for(int match=0;match<d.length;match++){
	        if(c[match]==d[match]){
	          count++;
	        }
	        if(count==d.length){
	          s="true";
	        }
	      }
	    }
	    return s;
	}	

}
