/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static int[] Terminal(int[] inventory) {
		Scanner input = new Scanner(System.in);
		int intput;
	for(int i = 0; i < inventory.length; i++){
		intput = input.nextInt();
		inventory[i] = intput;
 	}
	return inventory;
	}
	
	public static void main(String args[]) {
		int[] inventory = new int[10];
				inventory = Terminal(inventory);
				for(int i = 0; i < inventory.length; i++){
				System.out.println(inventory[i]);
		}
	}
}
