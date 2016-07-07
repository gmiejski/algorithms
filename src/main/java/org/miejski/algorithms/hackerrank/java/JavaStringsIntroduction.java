package org.miejski.algorithms.hackerrank.java;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        String lex = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(lex);
        System.out.println(toCamel(A) + " " + toCamel(B));


    }

    private static String toCamel(String a) {
        if (a == null || a.isEmpty()) {
            return a;
        }
        return a.substring(0, 1).toUpperCase() + a.substring(1);
    }


}
