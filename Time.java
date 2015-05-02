/*
class Time {
	private  int  hour;
	private  int  minute;
	private  int  second;
		
	public  void Time( ) { }
	public  void setTime(int  hr , int  min, int  sec) {  }
	public  void printTime( ) {  }
	public  void tick( ) {
	  // tick method defined
	}
}

The class Time defines a time object.  It represents time (military time) in 2400 hours.
	10 AM = 10 hours, 0 minutes and 0 seconds
	4 PM = 16 hours, 0 minutes and 0 seconds
	7:26PM = 19 hours, 26 minutes and 0 seconds
	Assume 0 represents 00 in this case.

1) Implement the constructor Time that will set the instance variables to zero.

2) Implement the setTime method to set the instance variables according to the values passed in.

3) Implement the printTime method to print time in hours:minutes:seconds   e.g.  16:37:23

4) Implement the tick( ) method that will increment the time object by one second.
Remember that 60 seconds = 1 minute, 60 minutes = 1 hour, and the max hours is 24.

5) Test the time object.  
Increment the Time object by 60 seconds and print out the time.
Repeat question 5 for several different instances of the Time object.  Each instance should have a different starting time.

*/


class Time{
	
	private int hour;
	private int minute;
	private int second;
	
	Time()
	{}

	public void Time (){
		hour = 00;
		minute = 00;
		second = 00;
	}
	
	public void setTime (int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}
	
	public String printTime() {
		String time = new String (hour + ":" + minute + ":" + second);
		return time;
	}
	
	public void tick (int ticks){
		
		int amt; 
		amt = second+ (minute*60)+ (hour*3600);
		
		amt = amt + ticks;
		hour = amt /3600;
			if (hour>=24)
			hour = hour -24;
			
		amt = amt%3600;
		minute = amt/60;
		
		amt = amt%60;
		second=amt;
		
	}	
}