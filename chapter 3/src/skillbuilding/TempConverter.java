package skillbuilding;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.0"); 
		
		System.out.println("Please enter the temperature in Fahrenheit(ºF):");
		double f = userinput.nextDouble();
		
		System.out.println("The temperature in Degree Celsius:\n" + (dc.format(5*(f-32)/9) + "°C"));

	}

}
