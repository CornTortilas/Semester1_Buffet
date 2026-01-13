/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Random;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int balance = 100;
		int wager;
		String stringput = new String();
		Scanner input = new Scanner(System.in);
		System.out.println("Slot machine Rules;\n1. Each player starts with $100.\n2. Input a wager less than your total amount of money\n3. The slot machine will roll three numbers from 1 to 10");
		System.out.println("	a. If two number match, you will double your money.\n	b. If three numbers match, you triple your money.\n		c. If none match, you lose your money");
		while(balance>0){
		System.out.print("---------------------------------------------------------\n\nWould you like to play the slots? (Yes/yes/Y/y) : ");
		stringput = input.next();
		if (!stringput.matches("(?i)^(?:yes|y)$")){
			if(stringput.matches("(?i)^(?:no|n)$"))
			System.out.print("Sad to see you go! You still have $" + balance + " left. Come again soon! Thanks!");
			break;
		}
		else{
		System.out.println("How much would you like to wager? ");
		wager = input.nextInt();
		if(wager>balance){
		while(wager>balance){
		System.out.println("You only have $" + balance + ". Please enter a smaller number :");
		wager = input.nextInt();
			}
		}
	int	a = (int)(Math.random()*10+1);
	int b = (int)(Math.random()*10+1);
	int c = (int)(Math.random()*10+1);
	balance -= wager;
		System.out.println("| " + a + " | " + b + " | " + c + " |");
		if(a == b && a == c) {
				wager *= 3;
				balance += wager;
				System.out.println("Your wager has tripled, you have $" + balance);
			}
			else if(a == c || a == b || b == c){
			wager *= 2;
			balance += wager;
			System.out.println("Your wager has doubled, you have $" + balance);
		}
		else if(balance > 0){
			System.out.println("Your wager has been lost, you have $" + balance);
		}
		else{
			System.out.println("You lost all your money D: \nCome back another time!");
			break;
				}
			}
		}
	}
}
