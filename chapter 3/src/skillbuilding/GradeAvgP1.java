package skillbuilding;

import java.util.Scanner;

public class GradeAvgP1
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Please enter the first grade: ");
		int first = userinput.nextInt();
		
		System.out.println("Please enter the second grade: ");
		int second = userinput.nextInt();
		
		System.out.println("Please enter the third grade: ");
		int third = userinput.nextInt();
		
		System.out.println("Please enter the fourth grade: ");
		int fourth = userinput.nextInt();
		
		System.out.println("Please enter the fifth grade: ");
		int fifth = userinput.nextInt();
		
		double x = (Math.round(first + second + third + fourth + fifth)/5);
		
		System.out.print("Average: " + x);

	}

}
