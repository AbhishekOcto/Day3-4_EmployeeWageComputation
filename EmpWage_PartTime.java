package com.bridgeLabz.empWage;
import java.util.Random;
public class EmpWage_PartTime extends DailyEmpWage {
		
		public static int Attendance() {
			
			Random random = new Random();
			int check = random.nextInt(3);
			
			return check;
		}
		
	    public static int PartTimeWage() {             // adding part time wage
	    	
	    	int WagePerHr = 20, PartTimeHr = 4;
	    	int PartTimeWage = WagePerHr * PartTimeHr;
	        return PartTimeWage;
		
	    	
	    }
	    
		public static void main(String[] args) {
			
			int isPresent = 1, isParttime = 2, isAbsent=0;
			
			int attendance = Attendance();  
			int dailyWage = Wage();                    
			
			if (attendance == isPresent) {
				
				System.out.print("Employee Full day wage = "+dailyWage);
				}
				
			else if(attendance == isParttime) {

				System.out.println("Employee Part time wage = "+PartTimeWage());
				}
			
			else {
				
				System.out.println("Employee Daily Wager = Emp Absent " +isAbsent);
			}
		

	}

}
