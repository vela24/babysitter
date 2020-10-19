package babySitter;

import java.util.Scanner;

public class Babysitter {	

	public static void main(String[] args) {
		int totalPayment = 0;
		AmountPaid b = new AmountPaid();
		
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your working hours: ");
		int hours = scanner.nextInt(); 
		
		b.setPayRate(hours); 
		
		System.out.println("your payment is " + b.getHoursWorked() );
	}

}
