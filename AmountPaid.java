package babySitter;
public class AmountPaid {
	int regularHours = 12;
	int bedToMid = 8;
	int midToEnd = 16;
	int amountPaid;
	int baseHoursWorked = 5;
	int pay;
	int adjustedHours;
	int addedHours;
	int basePay;
	int middle;
	
	
	public void setPayRate(int hours) {
		if(hours <= 5) {
			amountPaid = hours * regularHours;
		}
		
		else if (hours > 5 && hours < 8) {
			adjustedHours = hours - baseHoursWorked;
			basePay = baseHoursWorked * regularHours;
			addedHours = adjustedHours * bedToMid;
			amountPaid = addedHours + basePay;
		}
		
		else if (hours > 7 && hours < 12) {
			middle = 2 * bedToMid;
			basePay = (baseHoursWorked * regularHours) + middle ;
			pay = (hours - 7) * midToEnd;
			amountPaid = pay + basePay;
		}
		else {
			
			System.out.println("Please enter valid amount of time worked");
		}
	}

	public int getHoursWorked() {
		return amountPaid;
	}


}
