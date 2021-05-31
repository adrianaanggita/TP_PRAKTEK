package ConstructorTest;
import java.util.*;

/**
 * This program demonstrates object construction
 * @version 1. 01 20004-02-19
 * @author Adriana Anggita D
 */

public class ConstructorTest {

    public static void main(String[] args) {
        System.out.println("ProductName | Quantity | Weight | Destination | Service Value | Total");
        System.out.println("Celana Jeans | 1 | 2 | JAKARTA | Yakin Esok Sampai (YES) 48000 | 128000");
        System.out.println("Kemeja Lengan Panjang | 2 | 2 | JAKARTA | Reguler (REG) 26000 | 206000");
        //fill the staff array with three Employee objects
        Employee[] staff = new Employee[3];

        staff[0] = new Employee("Harry", 400000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee(60000);

        //print out information about all Employee objects
        for (Employee e : staff) {
            System.out.println("\n\n\n\n\nname = " +e.getName()+ "\nid = " + e.getId()+ "\nsalary = " +e.getSalary());
        }

    }
}
