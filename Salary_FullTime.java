class FullTime extends Employee {
	
	private double salary;
	
	FullTime (){
		//super("");   //another solution
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double pay(){
		return salary;
	}
	
	public double superpay(){
		return salary + super.pay();  //super.pay is the salary for bonus. everyone can get $15 as bonus.
	}
}