package feb1401;

public class BRACU {
	
	public void vc(){
		int msg = 2017;
		System.out.println("I am VC "+ msg);
		System.out.println("before hod "+msg);
		hod(msg);
		System.out.println("after hod "+msg);
	}
	public void hod(int msg){
		System.out.println("I am HoD "+ msg);
		System.out.println("before dco "+msg);
		msg = msg+1000;
		dco(msg);
		System.out.println("after dco "+ msg);
	}
	public void dco(int msg){
		msg = msg+2000;
		System.out.println("I am DCO "+ msg);
	}

}
