package skillbuilding;

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceP2
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter the first segment:");
		double x = userinput.nextDouble();
		
		System.out.println("Please enter the second segment:");
		double y = userinput.nextDouble();
		
		System.out.println("Please enter the third segment:");
		double z = userinput.nextDouble();
		
		double d = x + y + z;
	
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println("Distance: "+ (dc.format(d)) +" km");
		
	}

}
