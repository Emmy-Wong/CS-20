package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Spending
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		int total = 0;
		
		System.out.print("Enter the amount spent last month on the following items:\n\nFood: $");
		int food = userinput.nextInt();
		total += food;
		
		System.out.print("Clothing: $");
		int clothing = userinput.nextInt();
		total += clothing;
		
		System.out.print("Entertainment: $");
		int entertainment = userinput.nextInt();
		total += entertainment;
		
		System.out.print("Rent: $");
		int rent = userinput.nextInt();
		total += rent;
		int percentage = total/100;
		
		System.out.println("\nCategory\tBudget");
		System.out.println("Food\t" + (dc.format(food/percentage)) + " %");
		System.out.println("Clothing\t" + (dc.format(clothing/percentage)) + " %");
		System.out.println("Entertainment\t" + (dc.format(entertainment/percentage)) + " %");

	}

}
