package org.miejski.algorithms.hackerrank.java.strings;

import java.util.List;
import java.util.Scanner;

import static java.util.stream.Collectors.toList;

// https://www.hackerrank.com/challenges/java-anagrams
public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        return toSortedString(a.toLowerCase()).equals(toSortedString(b.toLowerCase()));
    }

    private static List<Integer> toSortedString(String string) {
        return string.chars().boxed().sorted().collect(toList());
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
