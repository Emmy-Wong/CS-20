package mastery;

import java.util.Scanner;

public class Digits
{

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Enter a three-digit number: ");
		int n = userinput.nextInt();
		
		if (n>999)
		{
			
			System.out.print("Error. You must enter a three-digit number.");
			
		}
		else
		{
			int hundreds = n/100;
			int tens = n%100/10;
			int ones = n%100%10;
			
			System.out.println("The hundreds place digit is: " + hundreds + "\nThe tens place digit is: " + tens + "\nThe ones place is: " + ones );
			
		}
		
	}

}
