package skillbuilding;

import java.util.Scanner;
import java.text.DecimalFormat;

public class CircleCircumference {

	public static void main(String[] args) {
		
		Scanner prompt = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.0");
		
		System.out.println("Please enter the radius of the circle: ");
		int r = prompt.nextInt();
		
		System.out.println("The circumference is " + (dc.format(Math.PI*(2*r))));
			
	}

}
