/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
	Scanner ints = new Scanner (System.in);
	
	System.out.print("Please input your first number : ");
	int num1 = ints.nextInt();
	System.out.println();
	
	System.out.print("Please input your second number : ");
	int num2 = ints.nextInt();
	System.out.println();
	
	boolean equal = (num1 == num2);
	boolean notEqual = (num1 != num2);
	
	if (equal)
	{
		System.out.print("Your numbers are the same");
	}
	
	if (notEqual)
	{
		System.out.print("Your numbers are different");
	}
	}
}
