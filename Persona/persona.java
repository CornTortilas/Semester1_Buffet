import java.util.Scanner;
import java.util.Random;

class persona{
    public static String options(String curLoc, String[] locList){
        if(curLoc.equals("apartment")){
            System.out.println("yup");
        }
        return curLoc;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String stringput;
        int intput;
        boolean boolput;
        // Destination list without logic
        String[] locList = new String[5];
        locList[0] = "apartment";
        
        String curLoc = "apartment";
        System.out.println("Hey there! Welcome to your new home!");
        System.out.println("Well, it's really an apartment...\n -Evan/Landlord");
        System.out.println("Just sign your first name here:");
        String nameFirst = input.nextLine();
        System.out.println("And your last name");
        String nameLast = input.nextLine();
        System.out.println("And your pronouns\n he,she,they,etc");
        String they = input.nextLine();
        System.out.println("your other pronouns\n him,her,them,etc");
        String them = input.nextLine();
        System.out.println("your other other pronouns\n his,her,their,etc");
        String their = input.nextLine();
        if(!their.equals("his")){
            String theirs = their+"s";
        }
        else{
            String theirs = their;
        }
        System.out.println("Hey there " + nameFirst + "! Welcome to your new home!");
        System.out.println("Well, it's more of an apartment...\n -Landlord");
        System.out.println("One more thing, what's your favorite color?\n -Landlord");
        System.out.println(options(curLoc, locList));
    }
}
