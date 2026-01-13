/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
		Scanner classes = new Scanner (System.in);

		System.out.println("Would you like to be a Wizard, Warrior or Rogue?");
		String classchoice = classes.nextLine();
			if (( classchoice.equals("Warrior") ) || ( classchoice.equals("warrior") )){ 
				System.out.println("You've chosen the Warrior! For honor!") ;
			}
			else if (( classchoice.equals("Wizard") ) || ( classchoice.equals("wizard") )){ 
				System.out.print("You've chosen the Wizard! Excelsior!");
			}
			else if (( classchoice.equals("Rogue") ) || ( classchoice.equals("rogue") )){ 
				System.out.println("You've chosen the Rogue! How cunning!");
			}
			else{
				System.out.print("You've chosen a role that doesn't exist. Rerun program");
			}
	}
}
