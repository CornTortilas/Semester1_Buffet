/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {

	System.out.println("Maximum = " + Math.max(13-6*11,30%7*(-2)));
	System.out.println("Square root = " + Math.sqrt(3*8+31%7));
	System.out.println("Power = " + Math.pow(37/3,35%21));
	System.out.println("Max = " + Math.max(Math.pow(2,14%3), Math.sqrt(2*6)));
	System.out.println();
	
	Scanner doubles = new Scanner (System.in);
	System.out.println("Type two of your own decimal numbers!");
	System.out.print("x = ");
	double x = doubles.nextDouble();
	System.out.print("y = ");
	double y = doubles.nextDouble();
	System.out.println();
	System.out.println("Let's do some math with these numbers");
	System.out.println("The higher of the two values is " + Math.max(x,y));
	System.out.println("The square root of y is " + Math.sqrt(y));
	System.out.println("x to the power of y is " + Math.pow(x,y));
	}
}
