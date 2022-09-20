package skillbuilding;

import java.util.Scanner;

public class GradeAvgP2
{

	public static void main(String[] args)
	{
		
		Scanner userinput = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("Please enter the first grade: ");
		int first = userinput.nextInt();
		x += first;
		
		System.out.println("Please enter the second grade: ");
		int second = userinput.nextInt();
		x += second;
		
		System.out.println("Please enter the third grade: ");
		int third = userinput.nextInt();
		x += third;
		 
		System.out.println("Please enter the fourth grade: ");
		int fourth = userinput.nextInt();
		x += fourth;
		
		System.out.println("Please enter the fifth grade: ");
		int fifth = userinput.nextInt();
		x += fifth;
		
		System.out.print("Average: " + (Math.round (x)/5));
		
	}

}
