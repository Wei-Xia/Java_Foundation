public class BankAccount_Basic {

	double balance;
	
	public BankAccount(double initialBalance){
		balance=initialBalance;
	}
	
	public void credit(double amt){
		balance=balance+amt;
		System.out.println ("You have earned "+ amt);
	}
	
	public void debit(double amt){
		if (balance>=amt){
			balance=balance-amt;
			System.out.println ("You have spent "+amt);
			}
		else
			System.out.println("Go to work and earn more money!");
	}
	
	public double getBalance(){
		return balance;
	}
	
	}


/*
Write a class called Bank_Account that stores the current balance of the account and contains two methods to debit and credit the account.  
Define a third method that returns the current balance.  Pass a value into a constructor to set an initial balance.  
Write the main method that instantiates two bank accounts and exercises the methods of the class.
*/




