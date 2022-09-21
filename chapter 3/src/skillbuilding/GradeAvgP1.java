package skillbuilding;

import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeAvgP1
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter the first grade: ");
		double first = userinput.nextInt();
		
		System.out.println("Please enter the second grade: ");
		double second = userinput.nextInt();
		
		System.out.println("Please enter the third grade: ");
		double third = userinput.nextInt();
		
		System.out.println("Please enter the fourth grade: ");
		double fourth = userinput.nextInt();
		
		System.out.println("Please enter the fifth grade: ");
		double fifth = userinput.nextInt();
		
		double x = ((first + second + third + fourth + fifth)/5);
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.print("Average: " + (dc.format(x)));

	}

}
