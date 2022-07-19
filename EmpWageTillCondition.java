package com.bridgeLabz.empWage;

public class EmpWageTillCondition extends EmpWage_SwitchCase {
	

		public static final int isFulltime = 1, isParttime = 2, isAbsent =0;
		
		public static void main(String[] args) {
			
			int TotalWage = 0, day = 0, WorkingHr = 0;
			
			while( day <= 20 || WorkingHr <= 100 ) {
			
				int check = Switch();
				
				switch (check) {
				
				case isFulltime:                                                        // full time wage
					
					day++;
					WorkingHr += 8;
					TotalWage += Wage();     // Daily wager
					break;
					
				case isParttime:                                                        // part time wage
					
					day++;
					WorkingHr += 4;
					TotalWage += PartTimeWage();
					break;
					
				default: 																	//Absent
					day++;
					WorkingHr += 0;
	                		TotalWage += 0;
	                		break;
				}
			}

			System.out.println(" Employee Monthly wages = "+TotalWage);
		}

	}

	
	

