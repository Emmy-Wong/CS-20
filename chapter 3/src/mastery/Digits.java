package mastery;

import java.util.Scanner;

public class Digits
{

	public static void main(String[] args)
	{
		Scanner prompt = new Scanner(System.in);
		
		System.out.print("Please enter a two-digits number: ");
		int n = prompt.nextInt();
		
		if (n>99)
		{
			
			System.out.print("Error. You must enter a two-digits number.");
			
		}
		else
		{
			
		System.out.println("Tens-place digit: " + (n/10));
		System.out.print("Ones-place digit: " +  (n%10));
		
		}
		
	}

}
