class EmployeeTest {
	public static void main (String[] args){
		
		FullTime bob = new FullTime();
		bob.setName ("Bob");
		bob.setSalary (10000);
		
		System.out.println ("Name is " + bob.getName());
		System.out.println ("Salary is " + bob.getSalary());
		System.out.println ("Salary is " + bob.pay());
		System.out.println ("Salary is " + bob.superpay());
		
		System.out.println ("------------------");
		
		PartTime jill = new PartTime();
		jill.setName ("Jill");
		jill.setHour (10);
		jill.setRate (9.5);
		
		System.out.println ("Name is " + jill.getName());
		System.out.println ("Salary is " + jill.getHour() * jill.getRate() );
		System.out.println ("Salary is " + jill.pay());
		System.out.println ("Salary is " + jill.superpay());

	}
	
}