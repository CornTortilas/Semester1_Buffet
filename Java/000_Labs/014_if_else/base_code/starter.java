/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner guess = new Scanner (System.in);
		
		int randomNum = (int) ( Math.random() * 1000 + 1 ); 
		System.out.println("Guess a number from 1 to 1000!");
		int guessNum = guess.nextInt();
		System.out.println();
		
		if( randomNum == guessNum ){
			System.out.println("You got it right!");
			System.out.print("COngratulations!!!");
		}	
		else{
			System.out.println("You got the wrong number D:");
			System.out.println("You answered : " + guessNum);
			System.out.print("The correct number was " + randomNum);
			
		}
		
	}
}
