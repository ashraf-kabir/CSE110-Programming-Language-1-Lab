package task12;

public class SavingsAccount {
	
	private static double annualInterestRate=4.2;
	
	private double savingsBalance;
	private double monthlyInterest;
	
	public SavingsAccount(double s){
		savingsBalance = s;
	}
	
	public static void modifyInterestRate(double a){
		annualInterestRate = a;
	}
	public void calculateMonthlyInterest(){
		monthlyInterest = savingsBalance*(annualInterestRate/12);
		savingsBalance += monthlyInterest;
	}
	
	public void printSavingsBalance(){
		System.out.println("Current balance = "+savingsBalance);
	}

}
