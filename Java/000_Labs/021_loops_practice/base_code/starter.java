/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 1 and 1000!");
		int correct = (int)(Math.random()*(1000-1)+1);
		int intput = input.nextInt();
		while(intput != correct){
			if(intput > correct){
				System.out.println("Your answer was greater");
				System.out.println("Try again");
				intput = input.nextInt();			}
			else if(intput < correct){
			System.out.println("You answer was lower");
			System.out.println("Try again");
			intput = input.nextInt();
			}
		}
		System.out.print("Nice job, you got it!");


		
	}
}
