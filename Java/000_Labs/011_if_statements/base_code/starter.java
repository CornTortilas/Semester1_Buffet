/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	int Rand1 = (int) (Math.random() * 10);
	int Rand2 = (int) (Math.random() * 10);
	boolean y = (Rand1 == Rand2);
	boolean x = (Rand1 != Rand2);
	System.out.println("The first variable is " + Rand1);
	System.out.println("The second variable is " + Rand2);
	if(x)
		{
			System.out.print("the variables are the different");
		}
		
		if(y)
		{
			System.out.print("the variables are the same");
		}
	}
}
