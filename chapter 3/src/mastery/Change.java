package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Change {

	public static void main(String[] args) {
		
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Enter the change in cents: ");
		int change = prompt.nextInt();
		
		if  (change>100)
		{
			
			System.out.println("Error. You must enter an amount less than 100 cents");
			
		}
		else
		{
			
			int quarter = (int)Math.floor(change/25);
			int dime = ((change%25)/10);
			int nickel = ((change%25%10)/5);
			int penny = ((change%25%10%5)/1);
			System.out.println
			("The minimum number of coins is:\nQuarters: " + quarter + "\nDimes: " + dime + "\nNickels: " + nickel + "\nPennies: " + penny);	
			
		}

	}

}
