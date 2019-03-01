package task13;

public class SavingAccount extends Account {
	
	public SavingAccount(String name, String aN, String aT, double b){
        this.name = name;
        this.accNumber = aN;
        if(aT=="Savings Account"){
            this.accountType=aT;
            this.balance=b;
        }
    }
	
    private double interestRate = 5.0;
    private double monthlyInterest = 0.0;
    
    public void modifyInterestRate(double iR) {
       interestRate = iR;
    }
    public void computeInterest() {
        monthlyInterest = balance*interestRate/12;
        balance += monthlyInterest;
    }

}
