package task13;

public class Account {
	
	public String name; 
    public String accNumber; 
    public String accountType;
    public double balance;
    
    public void depAmount(double d) {
        balance += d;
    }
    
    public void showBalance(){
        System.out.println("Your "+accountType+" balance is "+balance);
    }
    
    public void withdraw(double w){
        if(balance<500){
            System.out.println("balance is less then 500tk."+"\nFine 200tk."+ "\nNo withdraw!!");
        }else if(w>balance){
            System.out.println("insufficient balance.");
        }
        else{
            balance=balance-w;
            System.out.println("Withdraw successful."+"\nyour current balance is "+balance);
        }
    }

}
