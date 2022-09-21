package skillbuilding;

import java.util.Scanner;
import java.text.DecimalFormat;


public class GradeAvgP2
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		
		double x = 0;
		
		System.out.println("Please enter the first grade: ");
		double first = userinput.nextInt();
		x += first;
		
		System.out.println("Please enter the second grade: ");
		double second = userinput.nextInt();
		x += second;
		
		System.out.println("Please enter the third grade: ");
		double third = userinput.nextInt();
		x += third;
		 
		System.out.println("Please enter the fourth grade: ");
		double fourth = userinput.nextInt();
		x += fourth;
		
		System.out.println("Please enter the fifth grade: ");
		double fifth = userinput.nextInt();
		x += fifth;
		
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.print("Average: " + (dc.format ((x)/5)));
		
	}

}
