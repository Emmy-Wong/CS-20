package skillbuilding;

import java.text.DecimalFormat;

public class DistanceP1
{

	public static void main(String[] args)
	{
		
		double x = 12.2;
		double y = 10.6;
		double z = 5.8;
		
		double d = x + y + z;
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println("Distance: "+ (dc.format(d)) +" km");
		
	}

}
