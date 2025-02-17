class Bank{
    
    private int accNo;
    private double balance;
    
    Bank(int accNo, double balance){
        this.accNo = accNo;
        this.balance = balance;
    }
    
    void deposit(double amt){
        balance += amt;
        System.out.println("Deposit :" + amt + "    New Balance : " + balance);
    }
    
     void withdraw(double amt){
         if( balance < amt){
             System.out.println("Insufficient balance !!!!" + "   Balance is : " + amt);
         }else{
             balance -= amt;
             System.out.println("Withdraw :" + amt + "  New Balance : " + balance);
         }
    }
}

public class Main
{
	public static void main(String[] args) {
		Bank b = new Bank(12345, 5000);
		b.deposit(2000);
		b.withdraw(1000);
		b.withdraw(7000);
	}
}
