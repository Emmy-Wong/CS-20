package skillbuilding;

import java.util.Scanner;

public class TempConverter
{

	public static void main(String[] args)
	{
		
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Please enter the temperature in Fahrenheit(ºF):");
		double f = prompt.nextDouble();
		
		System.out.println("The temperature in Degree Celsius:\n" + (5*(f-32)/9) + "°C");

	}

}
