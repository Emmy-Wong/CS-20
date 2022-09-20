package skillbuilding;

import java.util.Scanner;

public class Digits
{

	public static void main(String[] args)
	{
		Scanner userinput = new Scanner(System.in);
		
		System.out.print("Please enter a two-digit number: ");
		int n = userinput.nextInt();
		
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