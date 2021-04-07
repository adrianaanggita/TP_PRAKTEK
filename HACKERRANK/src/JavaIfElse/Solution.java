package JavaIfElse;

import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int a = scanner.nextInt();

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");


        if ((a % 2 == 0) && ( a > 20)) {
            //if a is even and greater than 2o
            System.out.println("Not Weird");
        }
        else if ((a % 2 == 0) && (a >= 6 && a <= 20)) {
            //if a is even and in the inclusive range of 6 to 20
            System.out.println("Weird");
        }
        else if ((a % 2 == 0) && (a >= 2 && a <= 5)) {
            //if a is even and in the inclusive range of 2 to 5
            System.out.println("Not Weird");
        }
        else if (a % 2 != 0) {
            //if a is odd
            System.out.println("Weird");
        }

        scanner.close();
    }
}
