package com.bridgeLabz.empWage;

public class EmpWages_forMonth extends EmpWage_SwitchCase  {
	
	public static final int isFulltime = 1, isParttime = 2;
	
	public static void main(String[] args) {
		
		int TotalWage = 0;
		
		for(int Day = 1; Day <= 20; Day++) {
		
			int check = Switch();
			
			switch (check) {
			
			case isFulltime:   // full time wage
				
				TotalWage += Wage();     // Daily wager
				
				break;
				
			case isParttime:                                                        // part time wage
			
				TotalWage += PartTimeWage();
				break;
				
			default:                                                    //Absent

              			TotalWage += 0;
			}
		}

		System.out.println(" Employee Monthly wages = "+TotalWage);
	}


}
