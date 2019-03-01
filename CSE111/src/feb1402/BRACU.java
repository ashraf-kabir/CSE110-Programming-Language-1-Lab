package feb1402;

public class BRACU {
	
	public void vc(){
		int [] msg = {2017};
		System.out.println("I am VC "+ msg[0]);
		System.out.println("before hod "+msg[0]);
		hod(msg);
		System.out.println("after hod "+msg[0]);
	}
	public void hod(int [] msg){
		System.out.println("I am HoD "+ msg[0]);
		System.out.println("before dco "+msg[0]);
		msg[0] = msg[0]+1000;
		dco(msg);
		System.out.println("after dco "+ msg[0]);
	}
	public void dco(int []msg){
		msg[0] = msg[0]+2000;
		System.out.println("I am DCO "+ msg[0]);
	}

}
