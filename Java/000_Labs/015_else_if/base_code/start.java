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
		
		if( guessNum == randomNum ){
			System.out.println("You got it right!");
			System.out.print("COngratulations!!!");
		}	
		else if( guessNum > randomNum ){
			System.out.println("Your number was larger than the number");
			System.out.println("You guessed: " + guessNum);
			System.out.print("The correct number was " + randomNum);
		}
		else{
			System.out.println("Your number was smaller than the number");
			System.out.println("You guessed : " + guessNum);
			System.out.print("The correct number was " + randomNum);
		}	
	}
}
