package mastery;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Change {

	public static void main(String[] args) {
		
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Please enter an amount less than 100 cents: ");
		int change = prompt.nextInt();
		
		if  (change>100)
		{
			
			System.out.println("Error. You must enter an amount less than 100 cents");
			
		}
		else
		{
			
		}

	}

}
