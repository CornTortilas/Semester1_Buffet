/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner input = new Scanner(System.in);
	int intput;
	int a = input.nextInt();
	int b = input.nextInt();
	int c = input.nextInt();
	int max = 99;
	for(int l=a; l>0; l--){
		for(int i=c; i>0; i--){
			if(a%l == 0){
		if(c%i == 0){
			if(a/l*i+l*c/i == b){
			System.out.println("Standard form: " + a +"x² + " + b + "x + " + c);
			System.out.println("Factored form: (" + l + "x+" + i + ")(" + a/l +"x+" + c/i + ")\n");
			}
			/*else if(l*i+a/l*c/i == b){
			System.out.println("Standard form: " + a +"x² + " + b + "x + " + c);
			System.out.println("Factored form: (" + a/l + "x+" + i + ")(" + l +"x+" + c/i + ")\n");
			}*/
				}
			}
		}
	}
		System.out.println("over");
	}
}
