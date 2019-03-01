package task10;

class Task10 {
	String a,b;
	
	Task10(String a,String b){
		this.a=a;
	    this.b=b;
	}
	String equals(){
	    
		String s="false";
	    char c[]=a.toCharArray();
	    char d[]=b.toCharArray();
	    if(c.length==0&&d.length==0){           //if inputs are null
	      s="true";
	      System.out.println(s);
	    }
	    else if(d.length==c.length){            //if the length of comparing string is equal 
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
