package skillbuilding;

import java.util.Scanner;

public class GradeAvgP2
{

	public static void main(String[] args)
	{
		
		Scanner prompt = new Scanner(System.in);
		
		int x = 0;
		
		System.out.println("Please enter the first grade: ");
		int first = prompt.nextInt();
		x += first;
		
		System.out.println("Please enter the second grade: ");
		int second = prompt.nextInt();
		x += second;
		
		System.out.println("Please enter the third grade: ");
		int third = prompt.nextInt();
		x += third;
		 
		System.out.println("Please enter the fourth grade: ");
		int fourth = prompt.nextInt();
		x += fourth;
		
		System.out.println("Please enter the fifth grade: ");
		int fifth = prompt.nextInt();
		x += fifth;
		
		System.out.print("Average: " + (Math.round (x)/5));
		
	}

}
