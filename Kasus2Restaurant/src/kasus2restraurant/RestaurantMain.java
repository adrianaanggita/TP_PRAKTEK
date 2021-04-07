package kasus2restraurant;
/**
 *
 * @author Adriana Anggita Daeli
 */

import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        int number = 0;
        String take = "yes";
        String again = "yes";

        while ("yes".equalsIgnoreCase(take)) {
            System.out.println("MENU");
            menu.showMenu();
            System.out.println();
            System.out.println("Make an order? (yes/no)");
            take = in.nextLine();

            if ("yes".equalsIgnoreCase(take)) {
                while ("yes".equalsIgnoreCase(again)) {
                    number++;
                    System.out.println("\nORDER" + number);
                    //menu.showMenu();
                    menu.takeOrder();

                    System.out.println("Order again? (yes/no)");
                    again = in.nextLine();
                }
                again = "yes";
            }
            System.out.print("\n");
        }
    }
}
