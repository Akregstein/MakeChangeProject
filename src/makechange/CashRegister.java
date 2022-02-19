package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		double price = 0.0;
		double tender = 0.0;
		
		
		//user prompt price
		System.out.println("Please enter the price of an item between $0-$20:");
		price = kb.nextDouble();
		
		if (price > 20.0 || price < 0.0) {
			System.out.println("Invalid entry! Item must be within $0-$20:");
			
		}
		if ((price < 20.1 && price > 0.0)) {
		System.out.println("Please enter the amount of money paid:");
		tender = kb.nextDouble();
		}
		if(price > tender && price < 20.1) {
			System.out.println("You did not pay a sufficient amount of money!");
		}
		else if(price == tender) {
			System.out.println("You paid exact change! Thank you for your Purchase.");
		
		}
		
		else if(price < tender) {
			System.out.println("You paid more than item cost!");
			//givingChange(price, tender);
		}
//		 if (price > 20.0 || price < 0.0)
//			System.out.println("Invalid entry! Choose an item within $0-$20:");
		
		}
		
			//System.out.println("invalid entry!");
		
		//public static double givingChange(price, tender) {
			
		}
	




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