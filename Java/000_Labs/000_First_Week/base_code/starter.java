/*
 *	Author:  
 *  Date: 
*/import java.util.Random;
import java.util.Scanner;

class starter {
	public static void holding(int[] hands, String[] itemName){
		Scanner input = new Scanner(System.in);
		System.out.println("Which slot? (1-4)");
		int intput = input.nextInt();
		if(intput > 0 && intput < 5){
			System.out.println(intput + ": " + itemName[hands[(intput-1)]]);
		}
	}
	public static int[] scrapEvent(double pos, String[] itemName, int[] scrapPlace, int[] hands){
		Scanner input = new Scanner(System.in);
		boolean isScrap = false;
		String stringput = new String();
		int intput;
		for(int i = 1; i < scrapPlace.length; i++){
			if (scrapPlace[i] == pos){
			isScrap = true;
			break;
			}
		}
		if(isScrap){
			System.out.println("Scrap:");
		for(int i = 1; i < scrapPlace.length; i++){
			if(scrapPlace[i] == pos){
		System.out.println(itemName[i]);
			}
		}
			for(int l = 1; l < scrapPlace.length; l++){
				if (scrapPlace[l] == pos){
				System.out.println("Take the " + itemName[l] + "?");
				stringput = input.next();
				if(stringput.matches("(?i)^(?:yes|y)")){
					System.out.println("Which slot? (1-4): ");
					intput = input.nextInt();
					if(hands[(intput-1)] == 0){
					scrapPlace[l] = -1000;
					hands[(intput-1)] = l;
					System.out.println(intput + ": " + itemName[l]);
						}
					}
				}
			}
	}
	return hands;
}
	public static boolean monsterEvent(double pos, String[] monsterName, int[] monsterPlace, int[] hands, boolean dead){
		Scanner input = new Scanner(System.in);
		int intput;
		for(int i = 1; i < monsterPlace.length; i++){
			if (monsterPlace[i] == pos){
			System.out.println("There is a " + monsterName[i]);
			System.out.println("1. Run away");
			System.out.println("2. Fight");
			intput = input.nextInt();
			if (intput == 2){
				System.out.println("Which weapon?");
				intput = input.nextInt();
				if(hands[(intput-1)] > 3){
				System.out.println("The " + monsterName[i] + " is dead");	
				monsterPlace[i] = -1000;
				}
				else{
					System.out.print("You died");
					dead = true;
				}
			}
			else if (intput == 1)
				System.out.println("Which direction?");
				pos = pos;
			}
			
		}
		return dead;
	}

	public static void main(String args[]) {
	boolean dead = false;
	int intput;
	int quota = 120;
	int balance = 100;
	int[] hands = new int[4];
	int[] inventory = new int[6];
	int[] shopPrice = new int[6];
	shopPrice[0] = 0;
	shopPrice[1] = 15;
	shopPrice[2] = 25;
	shopPrice[3] = 20;
	shopPrice[4] = 30;
	shopPrice[5] = 100;
	String[] itemName = new String[6];
	//Nothing:
	itemName[0] = "Nothing";
	//Light:
	itemName[1] = "Flashlight";
	itemName[2] = "Pro Flashlight";
	//Exploration:
	itemName[3] = "Lockpick";
	//Weapons:
	itemName[4] = "Shovel";
	itemName[5] = "Shotgun";
	
	for(int i = 0; i < inventory.length; i++){
		inventory[i] = 0;
	}
	Scanner input = new Scanner (System.in);
	String stringput = new String();
	
	System.out.println("Hello, welcome to your new job!\n");
	System.out.println("This is the [TERMINAL]. You will use it to: \nbuy items \nsell items \nfind moons \nand much more!");
	
	while(!dead){
		System.out.println("type /h for help or use a command");
		stringput = input.next();
		if(stringput.equals("/h")){
			System.out.println("Commands:\n shop\n moons\n sell\n stats\n inventory");
		}
		else if (stringput.equals("shop")){
			System.out.println("Flashlight - 15\nPro Flashlight - 25\nLockpick - 20\nShovel - 30\nShotgun - 100");
			System.out.println("What would you like to buy?");
			stringput = input.next();
			for(int i = 0; i < inventory.length; i++){
			if (stringput.equals(itemName[i]) && balance >= shopPrice[i]){
				System.out.println("You have purchased a " + itemName[i]);
				inventory[i]++;
				balance -= shopPrice[i];
				System.out.println("Your balance is now " + balance);
				break;
				}
				else if(balance < shopPrice[i]){
					System.out.println("Your balance is too low");
				}
			}
		}
		else if (stringput.equals("sell")){
			System.out.print("sell placeholder");
		}
		else if (stringput.equals("moons")){
			System.out.println("Moon list placeholder");
			System.out.println("Please enter the moon you would like to fly to");
			stringput = input.next();
			if(stringput.equals("moon")){
				for(int i = 0; i < hands.length; i++){
					System.out.println("Slot " + (i+1));
					for(int l = 0; l < itemName.length; l++){
						System.out.println(l + ". " + itemName[l]);
					}
					System.out.println("What would you like to take with you? ");
					intput = input.nextInt();
					stringput = input.nextLine();
					if(inventory[intput] > 0){
					hands[i] = intput;
					inventory[intput]--;
					System.out.println("You now have " + inventory[intput] + " " + itemName[intput] + "s");
					}
					else if(intput == 0){
						System.out.println("There is nothing in your " + (i+1) + " slot");
					}
					else{
						System.out.println("Try again");
						i--;
					}
				}
					
		int facilityLengthOrWidth = 4;
		int[] roomNumber = new int[(int)Math.pow(facilityLengthOrWidth,2)];
for(int i = 0; i < roomNumber.length; i++){
	roomNumber[i] = (int)(Math.random()*11);
}

		int[] monsterPlace = new int[2];
for(int i = 0; i < monsterPlace.length; i++){
	monsterPlace[i] = (int)(Math.random()*roomNumber.length+1);
	for(int l = 0; l < i; l++){
		if(monsterPlace[i] == monsterPlace[l]){
			i--;
		}
	}
}

String[] monsterName = new String[2];
monsterName[0] = "Nothing";
monsterName[1] = "Spider";

int[] scrapPlace = new int[6];
for(int i = 0; i < scrapPlace.length; i++){
	scrapPlace[i] = (int)(Math.random()*roomNumber.length+1);
}

double pastPos = 1.0;
double pos = 1.0;
System.out.println("Welcome to THE FACILITY\nYou are in the bottom left corner of a " + (int)facilityLengthOrWidth + " x " + (int)facilityLengthOrWidth + " room\nWhich direction would you like to go:\nup\nright\ndown\nleft");
while(!dead){
	stringput = input.nextLine();
	pastPos = pos;
	if(pos == 1 && stringput.matches("(?i)^(?:ship|leave)")) {
		for(int i = 0; i < hands.length; i++){
			inventory[hands[i]] += 1;
			hands[i] = 0;
		}
		System.out.println("Welcome back to the [TERMINAL]");
		break;
	}
	else if(stringput.matches("(?i)^(?:hands|holding|inventory)")){
		holding(hands,itemName);
	}
	else if ((pos <= roomNumber.length-facilityLengthOrWidth) && stringput.matches("(?i)^(?:up|u)$")){
		pos += facilityLengthOrWidth;
		System.out.println("You moved up");
		dead = monsterEvent(pos, monsterName, monsterPlace, hands, dead);
		scrapEvent(pos, itemName, scrapPlace, hands);
	}
	else if ((pos <= roomNumber.length-1) && (pos%facilityLengthOrWidth != 0 || pos == 0) && (stringput.matches("(?i)^(?:right|r)$"))){
		pos++;
		System.out.println("You moved right");
		dead = monsterEvent(pos, monsterName, monsterPlace, hands, dead);
		scrapEvent(pos, itemName, scrapPlace, hands);
	}
	else if ((pos > facilityLengthOrWidth) && (stringput.matches("(?i)^(?:down|d)$"))){
		pos-=facilityLengthOrWidth;
		System.out.println("You moved down");
		dead = monsterEvent(pos, monsterName, monsterPlace, hands, dead);
		scrapEvent(pos, itemName, scrapPlace, hands);
	}
	else if ((pos >= 1) && (pos%facilityLengthOrWidth != 1) && (stringput.matches("(?i)^(?:left|l)"))){
		pos--;
		System.out.println("You moved left");
		dead = monsterEvent(pos, monsterName, monsterPlace, hands, dead);
		scrapEvent(pos, itemName, scrapPlace, hands);
	}
	else{
	System.out.println("You have not moved");
	dead = dead = monsterEvent(pos, monsterName, monsterPlace, hands, dead);
	scrapEvent(pos, itemName, scrapPlace, hands);
			}
		}
	}
}
		else if(stringput.equals("stats")){
			System.out.println("Quota: ");
			System.out.println("Balance:" + balance);
			System.out.println("Weight: ");
			System.out.println("Weight level:" );
			System.out.println("");
		}
		else if(stringput.equals("inventory")){
			for (int i = 1; i < inventory.length; i++)
			if(inventory[i] > 0){
				System.out.println(i + ". " + itemName[i] + ": " + inventory[i]);
			}
		}
		else if(stringput.equals("hands")){
			holding(hands, itemName);
			}
		}
	}
}