package kasus2restraurant;

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
        System.out.println("MENU");
        for (Menu value : menu) {
            if (!value.isOutOfStock()) {
                System.out.println("Id" + (value.getMenuId()) + " " + (value.getMenuName()) + "["
                        + value.getMenuStock() + "]" + "\tRp. " + value.getMenuPrice());
            }
        }
    }

    public void getOrder() {
        Scanner in = new Scanner(System.in);
        int[][] menuCart = new int[15][3];
        int x, id, qty;
        int total = 0;
        int numberOrder = 0;
        String takeOrder = "yes";
        String again = "yes";

        while ("yes".equalsIgnoreCase(takeOrder)) {
            showMenu();
            System.out.println("\nMake an order? (yes/no)");
            takeOrder = in.nextLine();

            if ("yes".equalsIgnoreCase(takeOrder)) {
                numberOrder = 0;
                while ("yes".equalsIgnoreCase(again)) {
                    numberOrder++;

                    System.out.println("\nORDER" + numberOrder);
                    System.out.println("What menu Id you want to order? ");
                    id = in.nextInt();
                    System.out.println("How many? ");
                    qty = in.nextInt();

                    for (Menu value : menu) {
                        if (value.getMenuId() == id) {
                            int stock = value.getMenuStock() - qty;
                            value.setMenuStock(stock);
                        }
                    }

                    x = numberOrder - 1;
                    menuCart[x][0] = id - 1;
                    menuCart[x][1] = qty;
                    menuCart[x][2] = (int) menu[id - 1].getMenuPrice() * qty;

                    System.out.println("Order again? (yes/no)");
                    again = in.next() + in.nextLine();
                }
                again = "yes";
            }

            if (numberOrder != 0) {
                System.out.println("\nYOUR ORDER");
                for (int i = 0; i < numberOrder; i++) {
                    System.out.printf("%d %11s %6d\n", menuCart[i][1], menu[menuCart[i][0]].getMenuName(), menuCart[i][2]);
                }
                for (int i = 0; i < numberOrder; i++) {
                    total += menuCart[i][2];
                }
                System.out.println("TOTAL EXPENSE : Rp. " + total + ".0");
            }
             System.out.println();
        }
    }
}
