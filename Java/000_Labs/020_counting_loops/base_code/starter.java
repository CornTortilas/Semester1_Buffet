/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		String stringput = input.next();
		String name = new String(stringput);
		System.out.println("How many times do you want to print your name?");
		int intput = input.nextInt();
		int count = 0;
		while(intput>count){
			System.out.print(name);
			count++;
		}
		



		
	}
}
