/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner ascii = new Scanner (System.in);
		System.out.println("Enter a word");
		String word = ascii.nextLine();
		
		if (word.equals("cat")){
			System.out.println("  _    _");
			System.out.println(" /_\\_ /_\\_________     __");
			System.out.println(" | O  O            |__/ _)");
			System.out.println(" |                  ___/");
			System.out.println(" | ______   ______ |  ");
			System.out.println(" | |     | |     | |");
			System.out.println(" \\_/     \\_/     \\_/");
		}
		else if(word.equals("ball")){
			System.out.println(" _________");
			System.out.println("/         \\");
			System.out.println("|         |");
			System.out.println("|         |");
			System.out.println("\\_________/");
		}
		else if(word.equals("face")){
			System.out.println("ᕙ(⇀‸↼‶)ᕗ");
		}
		else{
			System.out.println("Invalid input");
		}
	
		
	}
}
