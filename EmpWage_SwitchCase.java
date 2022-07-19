package com.bridgeLabz.empWage;
import java.util.Random;
public class EmpWage_SwitchCase extends EmpWage_PartTime {

	
		public static final int isFulltime = 1, isParttime = 2 , isabsent = 0;
		
		public static int Switch() {
			
			Random random = new Random();
			int check = random.nextInt(3);
			return check;
		}
		public static void main(String[] args) {
			
			int check = Switch();
			
			switch (check) {
			
			case isFulltime: 					// full time wage
				
				System.out.println("Employee Full day Wages = "+Wage());
				break;
				
			case isParttime:                                                        // part time wage
			
				System.out.println("Employee Part time Wages = "+PartTimeWage());
				break;
			default:
				System.out.println("Employee is Absent");               //Absent
			}
			
		

	}
	
}
