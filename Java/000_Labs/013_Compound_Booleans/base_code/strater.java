/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	
		Scanner ints = new Scanner (System.in);
		
		System.out.print("Please enter your first number: ");
		int intOne = ints.nextInt();
		System.out.print("Please enter your second number: ");
		int intTwo = ints.nextInt();
		System.out.print("Please enter your third number: ");
		int intThree = ints.nextInt();
		
		if ( ( intOne > intTwo ) && ( intOne > intThree ) ) {
			System.out.println("The first number is the largest of the three");
			System.out.println("The number is " + intOne);
		}
		
		if ( ( intTwo > intOne ) && ( intTwo > intThree ) ) {
			System.out.println("The second number is the largest of the three");
			System.out.println("The number is " + intTwo);
		}
		
		if ( ( intThree > intOne ) && ( intThree > intTwo ) ) {
			System.out.println("The third number is the largest of the three");
			System.out.println("The number is " + intThree);
		}
		
		if ( ( intOne < intTwo ) && ( intOne < intThree ) ) {
			System.out.println("The first number is the smallest of the three" );
			System.out.println("The number is " + intOne);
		}
		
		if ( ( intTwo < intOne ) && ( intTwo < intThree ) ) {
			System.out.println("The second number is the smallest of the three" );
			System.out.println("The number is " + intTwo);
		}
		
		if (  ( intThree < intOne ) && ( intThree < intTwo ) )	{
			System.out.println("The third number is the smallest of the three" );
			System.out.println("The number is " + intThree);
		}
	}
}
