package com.bridgeLabz.empWage;
import java.util.Random;
public class EmployeeAttendence {
	
		public static int Attendence() {
		
			Random random = new Random();
			int check = random.nextInt(2);
		
			return check;
		}
		
		public static void main(String args[]) {
			
			int check = Attendence();
			int isPresent = 1;  
			int isAbsent = 0;
			
			if( check == isPresent ) {
				System.out.println("Employee is present" +isPresent);	
			}
			
			else {	
				System.out.println("Employee is absent" + isAbsent);
			}	
		}
	
}
