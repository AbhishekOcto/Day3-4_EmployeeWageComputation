package com.bridgeLabz.empWage;
 
public class DailyEmpWage extends EmployeeAttendence {

		
		public static int Wage() {
			
			int WagePerHr = 20, FullDayHr = 8;
			int Daily_wage = WagePerHr * FullDayHr;
			return Daily_wage;
		}
		
		public static void main(String[] args) {
			
			int attendence = Attendence();
			
			int isPresent = 1, isAbsent = 0; 
			
			if (attendence == isPresent) {
				
			System.out.print("Employee Daily wager = "+Wage());
			}
			
			else {
				
				System.out.println("Employee Daily Wager = employee is absent "+isAbsent);
			}
		
	}
}
