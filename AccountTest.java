public class AccountTest{
	public static void main(String args[]) {
		
		Account bob= new Account();
		bob.deposit(100);
		
		if((bob.getBalance()-500)>=0)
			bob.withdraw(500);
		else
			System.out.println ("Not enough funds in your account");	
		
		System.out.println ("Bob balance is "+bob.getBalance());
		
		Account jill= new Account();
		jill.deposit(500);
		System.out.println ("Jill balance is "+jill.getBalance());  //create methods to access private balance
		
		Account fred = new Account(1000);
		System.out.println ("Fred balance is "+fred.getBalance()); 
	}
	
}