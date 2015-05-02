class PartTime extends Employee {
	
	private int hours;
	private double rate;
	
	public void setHour (int hr) {
		hours = hr;
	}
	
	public int getHour() {
		return hours;
	}
	
	public void setRate (double rt){
		rate = rt;
	}
	
	public double getRate(){
		return rate;
	}
	
	public double pay(){
		return (hours*rate);
	}
	
	public double superpay(){
		return (hours*rate)+ super.pay();
	}
			
}