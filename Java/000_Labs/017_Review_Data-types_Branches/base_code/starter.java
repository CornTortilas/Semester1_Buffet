/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner (System.in);
		System.out.println("What is your name adventurer?");
		String name = input.nextLine();
		System.out.println(name + ", what is your title?");
		String title = input.nextLine();
		System.out.println("Would you like to be a Wizard, Warrior or Rogue?");
		String classchoice = input.nextLine();
			if ( classchoice.equals("Warrior")  || classchoice.equals("warrior")  || classchoice.equals("Wizard")  || classchoice.equals("wizard") || classchoice.equals("Rogue")  || classchoice.equals("rogue") ){ 
				System.out.println("You've chosen the " + classchoice + ". Good luck on your quest!") ;
			}
			else{
				System.out.print("You've chosen a role that doesn't exist. Rerun program");
				hasRole = false;
			}
			
			if (hasRole){
				int pointsLeft = 20;
				System.out.println("You have 20 skill points to spend in the following");
				System.out.println("Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
				
				
				System.out.print("Strength (1-10): ");
				int strPoints = input.nextInt();
				if (strPoints > 10){
				System.out.println("Please input  a smaller value");
					System.out.print("Strength (1-10): ");
					strPoints = input.nextInt();
					pointsLeft = pointsLeft - strPoints;
					System.out.println("You have " + pointsLeft + " points left" );
				}
				else{
					pointsLeft = pointsLeft - strPoints;
					System.out.println("You have " + pointsLeft + " points left" );
				}
					System.out.print("Dexterity (1-10): ");
				int dexPoints = input.nextInt();
				if (dexPoints > 10){
				System.out.println("Please input  a smaller value");
					System.out.print("Dexterity (1-10): ");
				dexPoints = input.nextInt();
					pointsLeft = pointsLeft - dexPoints;
					System.out.println("You have " + pointsLeft + " points left" );
				}
				else{
					pointsLeft = pointsLeft - dexPoints;
					System.out.println("You have " + pointsLeft + " points left" );
					}
					System.out.print("Intelligence (1-10): ");
				int intPoints = input.nextInt();
				if ((intPoints > 10) || (intPoints > pointsLeft)){ 
				System.out.println("Please input  a smaller value");
					System.out.print("Intelligence (1-10): ");
					intPoints = input.nextInt();
					pointsLeft = pointsLeft - intPoints;
					System.out.println("You have " + pointsLeft + " points left" );
				}
				else{
					pointsLeft = pointsLeft - intPoints;
					System.out.println("You have " + pointsLeft + " points left" );
					}
					System.out.print("Charisma (1-10): ");
				int chaPoints = input.nextInt();
				if ((chaPoints > 10) || (chaPoints > pointsLeft)){
				System.out.println("Please input  a smaller value");
					System.out.print("Charisma (1-10): ");
					chaPoints = input.nextInt();
					pointsLeft = pointsLeft - chaPoints;
					System.out.println("You have " + pointsLeft + " points left" );
				}
				else{
					pointsLeft = pointsLeft - chaPoints;
					System.out.println("You have " + pointsLeft + " points left" );
					}
					
					if ( pointsLeft > 20 || pointsLeft < 0 || strPoints > 10 || strPoints < 0 || dexPoints > 10 || dexPoints < 0 || intPoints > 10 || intPoints < 0 || chaPoints > 10 || chaPoints < 0){
						
						System.out.println("Points invalid : Please rerun program");
						System.out.println("And don't cheat next time");
					}
					else{
						System.out.println("-----------------------");
						System.out.println("You are " + name + ", the " + title + " of CVHS");
						System.out.println("You're a " + classchoice + " with the following stats!");
						System.out.println("Strength - " + strPoints);
						System.out.println("Dexterity - " + dexPoints);
						System.out.println("Intelligence - " + intPoints);
						System.out.println("Charisma - " + chaPoints);
						System.out.println("Good luck on your quest " + name + ", " + title + "!");
					}
			}
	}
}
