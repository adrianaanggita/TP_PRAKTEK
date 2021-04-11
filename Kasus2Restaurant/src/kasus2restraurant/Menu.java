package kasus2restraurant;

public class Menu {
    private final int menuId;
    private String menuName;
    private double menuPrice;
    private int menuStock;

    // kasus2restraurant.Menu constructor initializes attributes
    public Menu(int id, String name, double price, int stock) {
        menuId = id;
        menuName = name;
        menuPrice = price;
        menuStock = stock;
    }

    public String getMenuName() {
        return menuName;
    }

    public double getMenuPrice() {
        return menuPrice;
    }

    public int getMenuStock() {
        return menuStock;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuStock(int menuStock) {
        this.menuStock = menuStock;
    }

    public boolean isOutOfStock() {
        return menuStock == 0;
    }
}
