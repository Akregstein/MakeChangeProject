package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price = 0.0;
		double tender = 0.0;
		double change = 0;
		int tenDollarBills = 0;
		int fiveDollarBills = 0;
		int oneDollarBills = 0;
		int pennies = 0;
		int nickels = 0;
		int quarters = 0;
		int twentyDollarBills = 0;
		int dimes = 0;
		
		// user prompt price
		System.out.println("Please enter the price of the item you'd like to purchase");
		price = kb.nextDouble();

		System.out.println("Please enter the amount of money paid:");
		tender = kb.nextDouble();

		

		if (price > tender) {
			System.out.println("Error: \nYou did not pay a sufficient amount of money!");
		} else if (price == tender) {
			System.out.println("You paid exact change! \nThank you for your Purchase.");

		}

		else if (price < tender) {
			System.out.println("You paid more than item cost! \n Your change due is:\n");
//			givingChange(price, tender);
			change = tender - price;

			if (change >= 20) {
				twentyDollarBills = (int) (change / 20);
				change = change % 20;
				System.out.println(" Twenty dollar bills: " + twentyDollarBills);
			}

			if (change >= 10) {
				tenDollarBills = (int) (change / 10);
				change = change % 10;
				System.out.println(" Ten dollar bills: " + tenDollarBills);
			}
			if (change >= 5) {
				fiveDollarBills = (int) (change / 5);
				change = change % 5;
				System.out.println(" Five dollar bills: " + fiveDollarBills);
			}
			if (change >= 1) {
				oneDollarBills = (int) (change / 1);
				change = change % 1;
				System.out.println(" One dollar bills: " + oneDollarBills);

			}
			if (change >= .25) {
				quarters = (int) (change / .25);
				change = change % .25;
				System.out.println(" Quarters: " + quarters);
			}
			if (change >= .10) {
				dimes = (int) (change / .10);
				change = change % .10;
				System.out.println(" Dimes: " + dimes);
			}
			if (change >= .05) {
				nickels = (int) (change / .05);
				change = change % .05;
				System.out.println(" Nickels: " + nickels);
			}
			if (change >= .01) {
				pennies = (int) (change / .01);
				change = change % .01;
				System.out.println(" Pennies: " + pennies);
			}

		}

	}

}








//		public static double givingChange(double price, double tender) {
//			int ten dollar bill = 0;
//			int five dollar bill = 0;
//			int one dollar bill = 0;
//			int pennies = 0;
//			int nickels = 0;
//			int quarters = 0;
//			
//			while(tender > price) {
//				
//				
//			}
//			return dollars;
//			

//*/
////User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
///*