package task13;

public class CurrentAccount extends Account {
	
	public CurrentAccount(String name, String aN, String aT, double b){
        this.name = name;
        this.accNumber = aN;
        
        if(aT == "Current Account"){
            this.accountType = "CurrentAccount";
        }
        else{
            System.out.println("wrong account ");
        }
        this.balance = b;
    }
	
    public void computeInterest(){
       //System.out.println("No interest for u ");
    }

}
