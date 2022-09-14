package skillbuilding;

import java.util.Scanner;

public class DistanceP2
{

	public static void main(String[] args)
	{
		
		Scanner prompt = new Scanner(System.in);
		
		System.out.println("Please enter the first segment:");
		double x = prompt.nextDouble();
		
		System.out.println("Please enter the second segment:");
		double y = prompt.nextDouble();
		
		System.out.println("Please enter the third segment:");
		double z = prompt.nextDouble();
		
		
		double d = x + y + z;
		
		System.out.println("Distance: "+ d +" km");
	}

}
