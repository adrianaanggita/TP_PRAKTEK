package JavaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");

        String A = sc.next();
        String B = sc.next();
        String cek;

        int lA = A.length();
        int lB = B.length();
        int total = lA + lB;

        if (A.compareTo(B) > 0) {
            cek = "Yes";
        } else {
            cek = "No";
        }
        String editA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String editB = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(total + newLine + cek + newLine + editA + " " + editB);

    }
}