/*
    Lecture note example - Input!!
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        Scanner Pizza = new Scanner(System.in);
        System.out.println("🍕Sammy's Pizza Parlor!🍕");
        System.out.println("         ~Menu~");
        System.out.println("1. Classic Three Cheese Delight $17.99");
        System.out.println("2. Meat Lover's Extravaganza 21.99");
        System.out.println("3. Vegan Wonderland 15.99");
        System.out.println();
        
        System.out.println("Who's order is this?");
        String orderName = Pizza.nextLine();
        System.out.println();
        
        System.out.println("How many Classic Three Cheese Delights would you like to order?");
        int item1 = Pizza.nextInt();
        System.out.println();
        System.out.println("How many Meat Lover's Extravaganza's would you like to order");
        int item2 = Pizza.nextInt();
        System.out.println();
        System.out.println("How many Vegan Wonderland's would you like to order?");
        int item3 = Pizza.nextInt();
        System.out.println();
        
        double price1 = item1 * 17.99;
        double price2 = item2 * 21.99;
        double price3 = item3 * 15.99;
        
        System.out.println("How much would you like to tip?");
        double tip = Pizza.nextDouble();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        double orderPrice = price1 + price2 + price3 + tip;
        System.out.println("-----------------------");
        System.out.println(    orderName + "'s receipt");
        System.out.println(item1 + "X Classic Three Cheese Delight = $" + price1);
        System.out.println(item2 + "X Meat Lover's Extravaganza = $" + price2);
        System.out.println(item3 + "X Vegan Wonderland = $" + price3);
        System.out.println("Tip = $" + tip);
        System.out.println("Your grand total is $ " + orderPrice);
	}
}
