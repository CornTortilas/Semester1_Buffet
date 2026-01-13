/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
Scanner number = new Scanner (System.in);
System.out.print("Please enter a number : ");
int num = number.nextInt();
System.out.println();

System.out.println("Here are the next 5 numbers!");
System.out.println(num + ", " + (num+1) + ", " + (num+2) + ", " + (num+3) + ", " + (num+4) + ", " + (num+5));
System.out.println();

System.out.println("Here are the next 5 multipes of " + num);
System.out.println(num + ", " + (num*2) + ", " + (num*3) + ", " + (num*4) + ", " + (num*5) + ", " + (num*6));
System.out.println();

System.out.println("Here is " + num + " divided by 100");
System.out.println(num/100.0);
System.out.println();

System.out.println("Here is " + num + " divided by 10");
System.out.println((num/10.0));
	}
}
