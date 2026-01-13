/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner (System.in);
		System.out.println("What is your name?");
		String Name = sc.nextLine ();
		System.out.println("What is your age?(#)");
		String Age = sc.nextLine ();
		System.out.println("What month were you born?(#)");
		String Bdaymonth = sc.nextLine ();
		System.out.println("What day were you born?(#)");
		String Bdayday = sc.nextLine ();
		System.out.println("What year were you born(#)");
		String Bdayyear = sc.nextLine ();
		System.out.println("If I have a dollar and two quarters, how much money do I have? (#.#)");
		String Buckfifty = sc.nextLine ();
		System.out.println("Your name is " + Name + " and you were born on " + Bdaymonth +"/" + Bdayday + "/" + Bdayyear);
		System.out.println("You are " + Age + " years old!!!");
		System.out.print("You have $" + Buckfifty + " in your wallet.");
		
	}
}