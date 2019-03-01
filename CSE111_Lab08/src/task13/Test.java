package task13;

public class Test {

	public static void main(String[] args) {
		
		CurrentAccount saver1 = new CurrentAccount("mike" , "123456", "Current Account", 25000.0);
        SavingAccount saver2 = new SavingAccount("smith", "654321", "Savings Account", 100.0);
        
        saver1.depAmount(2500);
        saver2.depAmount(10);
        
        saver1.computeInterest();
        saver2.computeInterest();
        
        saver1.showBalance();
        saver2.showBalance();
        
        saver1.withdraw(3000);
        saver2.withdraw(50);
	}

}
