/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Random;
import java.util.Scanner;

class starting {
	public static void main(String args[]) {
		
		Scanner range = new Scanner (System.in);
		
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.print("Please type an integer: ");
		int small = range.nextInt();
		System.out.print("Please type an integer larger than the first: ");
		int big = range.nextInt();
		System.out.println();
		
			if(small > big){
			System.out.println("It looks like you typed your numbers in the wrong order");
			System.out.println();
			
		System.out.println("Your range is " + big + " to " + small);
			System.out.println("Here are five numbers within that range");
			System.out.print( (int) ( Math.random() * (small - big) + big ) + ", ");
			System.out.print( (int) ( Math.random() * (small - big) + big ) + ", ");
			System.out.print( (int) ( Math.random() * (small - big) + big ) + ", ");
			System.out.print( (int) ( Math.random() * (small - big) + big ) + ", ");
			System.out.print( (int) ( Math.random() * (small - big) + big ) + ", ");
		}
			else{
		System.out.println("Your range is " + small + " to " + big);
		System.out.println("Here are five numbers within that range");
			System.out.print( (int) ( Math.random() * (big - small) + small ) + ", ");
			System.out.print( (int) ( Math.random() * (big - small) + small ) + ", ");
			System.out.print( (int) ( Math.random() * (big - small) + small ) + ", ");
			System.out.print( (int) ( Math.random() * (big - small) + small ) + ", ");
			System.out.print( (int) ( Math.random() * (big - small) + small ) + ", ");
		}
	}
}
