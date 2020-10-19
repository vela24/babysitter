package babySitter;

import java.util.Scanner;

public class Babysitter {
	
	private double pay;
	

	public static void main(String[] args) {
		int totalPayment = 0;
		AmountPaid b = new AmountPaid();
//		AmountPaid payment = new AmountPaid();
		
//		public double calculatePay(double hours, double rate) {
//			
//		}
		
		// if worked > 5 hours then payment is bedtime to midnight
		//if hours worked is > 7 then payment is midnight until end of job.
		
		// TODO Auto-generated method stub
		System.out.println("hello World");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your working hours: ");
		int hours = scanner.nextInt(); 
		
		b.setPayRate(hours); 
		
		System.out.println("your payment is " + b.getHoursWorked() );
	}

}
