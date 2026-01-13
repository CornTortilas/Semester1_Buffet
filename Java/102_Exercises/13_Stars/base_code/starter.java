/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want your stars to be (normal) or (reversed)?");
		String stringput = input.nextLine();
		System.out.print("How many stars do you want:");
		int intput = input.nextInt();
		if (stringput.equals("normal")){
		for(int i = 0; i <= intput; i++){
			for(int l = 0; l < i; l++){
			System.out.print("*");
			}
			System.out.println();
			}
		}
		else if (stringput.equals("reversed")){
			for(int i = 0; i < intput; i++){
				for(int l = i; intput - (l+1) > 0; l++){
				System.out.print(" ");
				}
				for(int l = i+1; l > 0; l--){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}
