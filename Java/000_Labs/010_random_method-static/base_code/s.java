/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	System.out.println("A number between 0-9: " + (int) (Math.random() * 10) );
	System.out.println("A number between 1-10: " + (int) (Math.random() * 100 + 1) );
	System.out.println("A double between 2.5 and 3.5: " + (Math.random() + 2.5 ) );
	System.out.println("A double between 14 and 589: " + (Math.random()* 575 + 14) );
	}
}
