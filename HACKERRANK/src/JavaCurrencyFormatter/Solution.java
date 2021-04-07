package JavaCurrencyFormatter;

import java.util.*;
import java.text.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        //CARA 1
        //String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        //String india = NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment);
        //String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        //String france = NumberFormat.getCurrencyInstance(Locale. FRANCE).format(payment);

        //System.out.println("US: " + us);
        //System.out.println("India: " + india);
        //System.out.println("China: " + china);
        //System.out.println("France: " + france);

        //CARA 2
        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " + NumberFormat.getCurrencyInstance(new Locale("en", "in")).format(payment));
        System.out.println("China: " + NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " + NumberFormat.getCurrencyInstance(Locale. FRANCE).format(payment));
    }
}
