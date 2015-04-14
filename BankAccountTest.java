public class BankAccountTest{
	public static void main(String args[]) {
	
		BankAccount A= new BankAccount(3000);
		BankAccount B= new BankAccount(2000);
		System.out.println ("A's balance: " + A.getBalance());
		A.credit(500);
		System.out.println ("A's balance: " + A.getBalance());
		A.debit(900);
		System.out.println ("A's balance: " + A.getBalance());
		System.out.println("\t");
		
		System.out.println ("B's balance: " + B.getBalance());
		B.credit (800);
		System.out.println ("B's balance: " + B.getBalance());
		B.debit (1500);
		System.out.println ("B's balance: " + B.getBalance());
		
	}
}



/*
Write a class called Bank_Account that stores the current balance of the account and contains two methods to debit and credit the account.  
Define a third method that returns the current balance.  Pass a value into a constructor to set an initial balance.  
Write the main method that instantiates two bank accounts and exercises the methods of the class.
*/