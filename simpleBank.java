import java.io.*;
class Account
{
	int acc_Number;
	double balance;
	Account()
	{
		acc_Number = 0;
		balance = 100;
	}
	Account(int aNumber, double b)
	{
		acc_Number = aNumber;
		balance = b;
	}
	void deposit(double amount)
	{
		balance = balance + amount;
	}
	void withdraw(double amount)
	{
		if(amount > balance)
		{
			System.out.println("Not enough balance");
		}
		else
		{
			balance = balance - amount;
		}
	}
	double getBalance()
	{
		return balance;
	}
}
class Saving_Account extends Account
{
	double interestRate;
	Saving_Account()
	{
		super();
		interestRate = 0.25;
	}
	Saving_Account(double iRate)
	{
		super();
		interestRate = iRate;
	}
	Saving_Account(double iRate, int aNumber, double b)
	{
		super(aNumber, b);
		interestRate = iRate;
	}
	void addInterest()
	{
		double amount = balance * interestRate;
		deposit(amount);
	}
	double getInterestRate()
	{
		return interestRate;
	}
}
class CurrentAccount extends Account
{
	double overdraftLimit;
	CurrentAccount()
	{
		super();
		overdraftLimit = 50;
	}
	CurrentAccount(double o_Limit)
	{
		super();
		overdraftLimit = o_Limit;
	}
	CurrentAccount(double oLimit, int aNumber, double b)
	{
		super(aNumber, b);
		overdraftLimit = oLimit;
	}
	void resetOverdraftLimit(double newLimit)
	{
		overdraftLimit = newLimit;
	}
	double getOverdraftLimit()
	{
		return overdraftLimit;
	}
}
class bank
{
	public static void main(String[] args)
	{
		Saving_Account a1 = new Saving_Account();
		Saving_Account a2 = new Saving_Account(0.5);
		Saving_Account a3 = new Saving_Account(0.5, 1234, 500);
		CurrentAccount b1 = new CurrentAccount();
		CurrentAccount b2 = new CurrentAccount(1000);
		CurrentAccount b3 = new CurrentAccount(1000, 1234, 500);
		a1.deposit(5000);
		b1.deposit(5000);
		System.out.println("Balance in Savings Account is: " + a1.getBalance());
		System.out.println("Balance in Current Account is: " + b1.getBalance());
		System.out.println("Interest rate in Savings Account is: " + a1.getInterestRate());
		b1.resetOverdraftLimit(1000);
		System.out.println("Overdraft limit in Current Account is: " + b1.getOverdraftLimit());
}
}
