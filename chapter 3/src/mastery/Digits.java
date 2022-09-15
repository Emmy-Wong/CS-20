package mastery;

import java.util.Scanner;

public class Digits
{

	public static void main(String[] args)
	{
		Scanner prompt = new Scanner(System.in);
		
		System.out.print("Please enter a two-digits number: ");
		int n = prompt.nextInt();
		
		System.out.println("Tens-place digit: " + Math.floor(n/10));
		System.out.print("Ones-place digit: " + (n - (Math.floor(n/10))*10));

	}

}
