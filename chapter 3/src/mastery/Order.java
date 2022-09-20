package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Order
{

	public static void main(String[] args)
	{
		
		double burgers = 1.69;
		double fries = 1.09;
		double sodas = 0.99;
		
		Scanner userinput = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		
		System.out.print("Enter the number of burgers: ");
		int burgersn = userinput.nextInt();
		
		System.out.print("Enter the number of fries: ");
		int friesn = userinput.nextInt();
		
		System.out.print("Enter the number of sodas: ");
		int sodasn = userinput.nextInt();
		
		 
		double total = ((burgers*burgersn) + (fries*friesn) + (sodas*sodasn));
		
		System.out.println("Total before tax: $" + dc.format(total));
		
		double tax = total*0.065;
		
		System.out.println("Tax: $" + dc.format(tax));
		
		double finalcost = (total + tax);
		
		System.out.println("Final total: $" + (dc.format(finalcost)));

	}

}
