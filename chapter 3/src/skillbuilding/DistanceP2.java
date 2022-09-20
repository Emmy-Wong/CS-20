package skillbuilding;

import java.util.Scanner;

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
		
		System.out.println("Distance: "+ d +" km");
	}

}
