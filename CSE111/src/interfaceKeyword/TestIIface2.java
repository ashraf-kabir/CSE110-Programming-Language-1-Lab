package interfaceKeyword;

public class TestIIface2 {

	public static void main(String[] args) {
		
		Callback c = new Client();
		AnotherClient obj = new AnotherClient();
		
		c.callback(42);
		
		c = obj;                  //c now refers to AnotherClient obj
		c.callback(42);
	}

}
