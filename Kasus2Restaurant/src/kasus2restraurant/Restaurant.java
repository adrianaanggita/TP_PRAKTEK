package kasus2restraurant; /**
 *
 * @author Adriana Anggita Daeli
 */

import java.util.Scanner;

public class Restaurant {
    private Menu[] menu; //array of kasus2restraurant.Menu

    public Restaurant() {
        menu = new Menu[4];
        menu[0] = new Menu(1, "Bala-bala", 1_000, 20);
        menu[1] = new Menu(2, "Gehu", 1_000, 20);
        menu[2] = new Menu(3, "Tahu", 1_000, 13);
        menu[3] = new Menu(4, "Molen", 1_000, 20);
    }

    public void showMenu() {
        for(int i = 0; i < menu.length; i++) {
            if(!menu[i].isOutOfStock()) {
                System.out.println("Id" + (menu[i].getMenuId()) + " " + (menu[i].getMenuName()) + "["
                        + menu[i].getMenuStock() + "]" + "\tRp. " + menu[i].getMenuPrice());
            }
        }
    }

    public void takeOrder() {
        Scanner in = new Scanner(System.in);
        int id, qty;

        System.out.println("What menu id you want to order? ");
        id = in.nextInt();
        System.out.println("How many? ");
        qty = in.nextInt();

        for(int i = 0; i < menu.length; i++) {
            if (menu[i].getMenuId() == id) {
                int stock = menu[i].getMenuStock() - qty;
                menu[i].setMenuStock(stock);
            }
        }
    }
}
